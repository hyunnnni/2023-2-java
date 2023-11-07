package com.green.day29.normal2;

import com.green.day29.normal2.Hanilwoofer;

public class HarmanSpeaker implements Speaker {//interface인 speaker를 부모로 가진다
    private Woofer woofer;

    public HarmanSpeaker(){
        woofer = new Hanilwoofer();
    }
    public void sound(){
        System.out.println("하만 스피커 : 쿵치 박치 쿵쿵치 박치 예!");
        woofer.soundBase();
    }
}
