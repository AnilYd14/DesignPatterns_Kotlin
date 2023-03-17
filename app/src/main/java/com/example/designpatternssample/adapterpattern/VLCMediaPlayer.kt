package com.example.designpatternssample.adapterpattern

/**
 * Created by Anil Yadav on 17/03/23.
 */
class VLCMediaPlayer : AdvanceMediaPlayer {
    override fun playVLC(fileName: String) {
       // play vlc format
    }

    override fun playMp4(fileName: String) {
      // do nothing
    }
}