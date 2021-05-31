package com.github.moqigit.app.cache

import android.content.Context
import com.danikula.videocache.HttpProxyCacheServer

/**
 *
 * created by reol at 2021/6/1
 */
object CacheServer {

    private var server: HttpProxyCacheServer? = null

    fun initServer(context: Context, block: HttpProxyCacheServer.Builder.() -> Unit) {
        val builder = HttpProxyCacheServer.Builder(context.applicationContext)
        block(builder)
        server = builder.build()
    }

    fun requireServer(): HttpProxyCacheServer = server!!
}