package com.green.day29.normal;

public class TvTest {
    public static void main(String[] args) {
        SamsungTv tv = new SamsungTv();
        tv.toggleMute();
        tv.toggleMute();
        tv.sound();
        tv.sound();
        tv.sound();
    }// 노말버전은 tv>> speaker>> woofer
    //이렇게 tv가 speaker를 speaker가 wooferㄹ르 불러야했다면
    //ioc는 그 반대라는 것
}
