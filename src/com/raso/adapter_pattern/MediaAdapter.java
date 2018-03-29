package com.raso.adapter_pattern;

public class MediaAdapter implements MediaPlayer{

    @Override
    public void play(String fileType, String fileName) {

        if(fileType.equalsIgnoreCase("vlc")){
            VlcPlayer vlcPlayer = new VlcPlayer();
            vlcPlayer.plyVlc(fileType,fileName);
        } else if(fileType.equalsIgnoreCase("mp4")){
            Mp4Player mp4Player = new Mp4Player();
            mp4Player.plyMp4(fileType,fileName);
        }
    }

}
