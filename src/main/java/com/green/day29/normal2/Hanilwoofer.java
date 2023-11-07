package com.green.day29.normal2;

public class Hanilwoofer implements Woofer {// 부모 woofer라는 걸 상속받음으로써 hanilwoofer타입에 얽매이지 않고 좀 더 유연하게
    //사용이 가능하다
    public void soundBase(){
        System.out.println("한일우퍼 : 초등학교 친구 이름은 박지예\n 화가 나면 벽에 얼굴을 박지 예!");
    }
}
