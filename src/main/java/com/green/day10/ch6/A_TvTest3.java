package com.green.day10.ch6;

public class A_TvTest3 {
    public static void main(String[] args){
       A_Tv tv1 = new A_Tv();

       A_Tv tv2 = tv1;//이때 tv2는 tv1에 접근하기 위한 주소값일 뿐 객체가 새로 생성된 게 아니다 동등하다는 뜻

        System.out.printf("tv1.channel : %d\n", tv1.channel);//디폴트값 0만 존재

        tv1.channelUp();//값이 1 올라가있다
        System.out.printf("tv1.channel : %d\n", tv1.channel);
        System.out.printf("tv2.channel : %d\n", tv2.channel);// 같은 곳에 접근한거기 때문에 안의 값은 같다
    }
}
