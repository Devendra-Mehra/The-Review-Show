package com.example.core.di.coroutines.asynctaskmanager

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred

interface AsyncTaskManager {

    suspend fun <T> async(block: suspend CoroutineScope.() -> T): Deferred<T>

    suspend fun <T> asyncAwait(block: suspend CoroutineScope.() -> T): T

    fun cancelAllAsync()

    fun cleanup()
}