package com.raso.adapter_pattern;

public class AudioPlayer implements MediaPlayer{

    private MediaAdapter mediaAdapter;




    @Override
    public void play(String fileType, String fileName) {

        if(fileType.equalsIgnoreCase("mp3")){
            System.out.println("Playing "+fileName+" in "+ fileType+" format");
        } else if((fileType.equalsIgnoreCase("vlc") || (fileType.equalsIgnoreCase("mp4")))){
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(fileType, fileName);
        }

    }
}
