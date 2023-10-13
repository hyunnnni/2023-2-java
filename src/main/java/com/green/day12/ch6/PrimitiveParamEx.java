package com.green.day12.ch6;


class Data {
    int x;
}
public class PrimitiveParamEx { //기본과 참조의 차이 기본은 주소값을 가질 수 없다 그냥 새로운 공간

    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10; //Data라는 클래스의 x값에 10을 대입해라
        System.out.printf("main() : x = %d\n", d.x);
        change(d.x);
        System.out.printf("main() : x = %d\n", d.x);
        System.out.println("-----------------------------------------------");

        Data d2 = new Data();
        d2.x = 100;
        System.out.printf("main() : d2.x = %d\n", d2.x);//100
        change(d2);
        System.out.printf("main() : d2.x = %d\n", d2.x);//100
    }

    public static void change(int x) {
        x = 1000;
        System.out.printf("change() : x = %d\n", x);
    }

    public static void change(Data d) {
        d = new Data();
        d.x =1000;
        System.out.printf("change() : x =%d\n", d.x);//1000
    }
}
