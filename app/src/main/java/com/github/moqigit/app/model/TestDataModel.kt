package com.github.moqigit.app.model

data class VideoItem(
  val name: String,
  val src: String,
  val cover: String?
)

object TestData {

  val videoList = arrayListOf(
    VideoItem("01", "", ""),
    VideoItem("02", "", ""),
    VideoItem("03", "", ""),
    VideoItem("04", "", ""),
  )

  val singleVideo = videoList[0]
}