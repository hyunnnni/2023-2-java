package com.green.day29.ioc;

public class Lgtv extends Tv {
    public Lgtv(Speaker speaker){//이거도 주소값을 그대로 받아서 담겠다
        //이 speaker는 애플 or 하만 그리고 그 스피커 안에서도 한성이나 한일 우퍼를 가지고 있다
        System.out.println("---LG TV생성---");
        this.speaker = speaker;
    }


}
