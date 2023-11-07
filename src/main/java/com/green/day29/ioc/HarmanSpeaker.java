package com.green.day29.ioc;

public class HarmanSpeaker implements Speaker {
    private Woofer woofer;

    public HarmanSpeaker(Woofer woofer){// 외부에서 들어오는 주소값을 쓰겠다
        this.woofer = woofer;
    }
    public void sound(){
        System.out.println("하만 스피커 : 쿵치 박치 쿵쿵치 박치 예!");
        woofer.soundBase();
    }
}
