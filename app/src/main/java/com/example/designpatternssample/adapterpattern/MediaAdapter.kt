package com.example.designpatternssample.adapterpattern

/**
 * Created by Anil Yadav on 17/03/23.
 */
class MediaAdapter(audioType: String) : MediaPlayer {


    private var advancedMusicPlayer: AdvanceMediaPlayer? = null

    init {
        if (audioType.equals("vlc", ignoreCase = true)) {
            advancedMusicPlayer = VLCMediaPlayer()
        } else if (audioType.equals("mp4", ignoreCase = true)) {
            advancedMusicPlayer = Mp4Player()
        }
    }
    override fun play(audioType: String, fileName: String) {
        if(audioType.equals("vlc",ignoreCase = true)){
            advancedMusicPlayer?.playVLC(fileName);
        }
        else if(audioType.equals("mp4",ignoreCase = true)){
            advancedMusicPlayer?.playMp4(fileName);
        }
    }
}