package id.kotlin.multiplatform

import kotlinx.coroutines.experimental.CoroutineDispatcher

internal expect val ApplicationDispatcher: CoroutineDispatcher
internal expect val UIDispatcher: CoroutineDispatcher