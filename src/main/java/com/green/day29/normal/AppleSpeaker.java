package com.green.day29.normal;

public class AppleSpeaker {
    private Hansungwoofer woofer;
    private Hanilwoofer superwoofer;

    public AppleSpeaker(){
        //woofer = new Hansungwoofer();
        superwoofer = new Hanilwoofer();
    }

    public void sound(){
        System.out.println("애플 스피커 : 크르르갉각 힛맨뱅");
        superwoofer.soundBase();
    }
}
