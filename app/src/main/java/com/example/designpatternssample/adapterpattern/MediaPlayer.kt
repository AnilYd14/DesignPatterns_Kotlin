package com.example.designpatternssample.adapterpattern

/**
 * Created by Anil Yadav on 17/03/23.
 */
interface MediaPlayer {

    fun play(audioType: String, fileName: String)
}

interface AdvanceMediaPlayer{
    fun playVLC(fileName: String)
    fun playMp4(fileName: String)
}