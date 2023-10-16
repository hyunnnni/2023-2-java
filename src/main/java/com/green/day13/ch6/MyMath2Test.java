package com.green.day13.ch6;

import java.sql.SQLOutput;

public class MyMath2Test {
    public static void main(String[] args) {
        MyMath2.staticNum = 1;// 클래스 메소드는 이렇게 사용하는 것 아래처럼 사용하는 경우는 거의 없다
        MyMath2 mm2 = new MyMath2();
        mm2.num = 10;
        mm2.staticNum  =30;
        System.out.printf("mm2.num =%d, staticNum = %d\n", mm2.num , mm2.staticNum );

        MyMath2 mm2_2 = new MyMath2();
        mm2_2.num = 100;
        mm2_2.staticNum  =50;
        System.out.printf("mm2_2.num =%d, staticNum = %d\n", mm2_2.num , mm2_2.staticNum );
        System.out.printf("mm2.num =%d, staticNum = %d\n", mm2.num , mm2.staticNum ); //staticNum값이 달라진다


        System.out.printf("MyMath2.staticNum = %d\n", MyMath2.staticNum);
    }
}
