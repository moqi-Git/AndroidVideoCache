package com.github.moqigit.app

import android.app.Application
import com.github.moqigit.app.cache.CacheServer
import com.github.moqigit.app.ext.ContextContainer

/**
 *
 * created by reol at 2021/6/1
 */
class XApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        ContextContainer.context = applicationContext
        initCacheServer()
    }

    private fun initCacheServer() {
        CacheServer.initServer(this) {
            maxCacheFilesCount(100)
            maxCacheSize(1024 * 1024 * 128)
        }
    }
}