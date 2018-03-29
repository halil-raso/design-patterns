package com.raso.adapter_pattern;

public class AdapterPatternTest {

    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","file1.mp3");
        audioPlayer.play("mp4","file2.mp4");
        audioPlayer.play("vlc","file3.vlc");
    }
}
