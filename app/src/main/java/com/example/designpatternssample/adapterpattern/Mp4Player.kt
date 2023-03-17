package com.example.designpatternssample.adapterpattern

/**
 * Created by Anil Yadav on 17/03/23.
 */
class Mp4Player : AdvanceMediaPlayer {
    override fun playVLC(fileName: String) {
        // do nothing
    }

    override fun playMp4(fileName: String) {
        // play mp4 files
    }
}