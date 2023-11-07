package com.green.day29.normal2;


public class AppleSpeaker implements Speaker{//interface인 speaker를 부모로 가진다
    //그래서 부모가 가진 sound라는 메소드의 규격에 맞춰져서 apple도 harman도 같은 규격의 메소드를 가지게 된다
    private Woofer woofer;

    public AppleSpeaker(){
        woofer = new Hanilwoofer();
    }

    public void sound(){
        System.out.println("애플 스피커 : 크르르갉각 힛맨뱅");
        woofer.soundBase();
    }
}
