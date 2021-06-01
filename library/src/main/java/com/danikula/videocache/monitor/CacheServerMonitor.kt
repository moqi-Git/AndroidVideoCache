package com.danikula.videocache.monitor

interface CacheServerMonitor {

  fun onCacheFileChanged(fileCount: Int, totalSize: Long)

  fun onServerStatusChanged(isAlive: Boolean)

  fun onProxyInfoCallback(info: ProxyInfo)

}

data class ProxyInfo(
  val host: String,
  val port: Int,
  val cacheFilePath: String,
)