package com.green.day29.normal;

public class HarmanSpeaker {
    private Hanilwoofer woofer;

    public HarmanSpeaker(){
        woofer = new Hanilwoofer();
    }
    public void speak(){
        System.out.println("하만 스피커 : 쿵치 박치 쿵쿵치 박치 예!");
        woofer.soundBase();
    }
}
