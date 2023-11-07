package com.green.day29.ioc;

public class AppleSpeaker implements Speaker {
    private Woofer woofer;

    public AppleSpeaker(Woofer woofer){//외부에서 들어오는 주소값을 그대로 담겠다
        this.woofer = woofer;//그래서 여기서 결정을 하지않는다는 소리
    }

    public void sound(){
        System.out.println("애플 스피커 : 크르르갉각 힛맨뱅");
        woofer.soundBase();
    }
}
