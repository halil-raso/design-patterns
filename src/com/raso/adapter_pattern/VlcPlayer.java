package com.raso.adapter_pattern;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void plyMp4(String fileType, String fileName) {
    }

    @Override
    public void plyVlc(String fileType, String fileName) {
        System.out.println("Playing "+fileName+" in "+ fileType+" format");
    }

}
