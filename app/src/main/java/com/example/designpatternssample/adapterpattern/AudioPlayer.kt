package com.example.designpatternssample.adapterpattern

/**
 * Created by Anil Yadav on 17/03/23.
 */
class AudioPlayer: MediaPlayer {
    private var mediaAdapter: MediaAdapter?=null

    override fun play(audioType: String, fileName: String) {
        //inbuilt support to play mp3 music files
        if(audioType.equals("mp3",ignoreCase = true)){
            println("Playing mp3 file. Name: $fileName");
        }

        //mediaAdapter is providing support to play other file formats
        else if(audioType.equals("vlc",ignoreCase = true) || audioType.equals("mp4",ignoreCase = true)){
            mediaAdapter = MediaAdapter(audioType);
            mediaAdapter?.play(audioType, fileName);
        }
    }
}