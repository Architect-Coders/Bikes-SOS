package com.damazo.bikes.common

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlin.coroutines.CoroutineContext

interface CustomCoroutineScope : CoroutineScope {

    var job: Job

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job

    fun initScope() {
        job = SupervisorJob()
    }

    fun cancelScope() {
        job.cancel()
    }

    class Impl : CustomCoroutineScope {
        override lateinit var job: Job
    }

}