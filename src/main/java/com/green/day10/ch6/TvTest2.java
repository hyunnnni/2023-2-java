package com.green.day10.ch6;

public class TvTest2 {
    public static void main(String[] args){
       Tv tv1 = new Tv();
        //NumberBox의 객체의 주소값을 담을 수 있는 레퍼런스+ 변수 이름  = 새로운 걸 만들었다+ 클래스명(); ← 이게 객체주소값

        System.out.printf("tv1.channel : %d\n", tv1.channel);//디폴트값 0만 존재

        tv1.channelUp();// 아까 만들어놓은 메소드를 읽어와서 값이 1 올라가있다
        System.out.printf("tv1.channel : %d\n", tv1.channel);
    }
}
