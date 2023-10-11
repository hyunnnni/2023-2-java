package com.green.day10.ch6;

public class TvTest2 {
    public static void main(String[] args){
       Tv tv1 = new Tv();

        System.out.printf("tv1.channel : %d\n", tv1.channel);//디폴트값 0만 존재

        tv1.channelUp();// 아까 만들어놓은 메소드를 읽어와서 값이 1 올라가있다
        System.out.printf("tv1.channel : %d\n", tv1.channel);
    }
}
