package com.raso.adapter_pattern;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void plyMp4(String fileType, String fileName) {
        System.out.println("Playing "+fileName+" in "+ fileType+" format");
    }

    @Override
    public void plyVlc(String fileType, String fileName) {

    }
}
