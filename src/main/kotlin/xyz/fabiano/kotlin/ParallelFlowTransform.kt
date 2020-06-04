    fun <R, S> Flow<R>.transform(scope: CoroutineScope, bufferSize: Int, transformer: suspend (R) -> S) =
            flow {
                val currCtx = scope.coroutineContext.minusKey(Job)

                coroutineScope {
                    val channel = produce(currCtx, bufferSize) {
                        collect { value ->
                            send(scope.async { transformer(value) })
                        }
                    }

                    (channel as Job).invokeOnCompletion { if (it is CancellationException && it.cause == null) cancel() }

                    for (defer in channel) {
                        emit(defer.await())
                    }
                }
            }
