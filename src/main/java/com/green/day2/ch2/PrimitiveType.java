package com.green.day2.Ch2;

public class PrimitiveType {
    public static void main(String[] args){

        //논리형
        boolean test = true, test2 = false;

        //문자형
        char ch= 'a', ch2 = '가';
        //한 글자만 가능 실제론 정수

        //정수형
        byte b1 = 1;
        short s1 = 2;
        int i3 = 3;
        long l4 = 4;

        //l, L을 붙이게 되면 타입을 바꿔줌 or 강제 형변환도 가능 (long으로)

        //실수형
        float f1 = 10.1f;
        //f를 붙이지 않으면 타입이 맞지않기 때문에 리터럴에 f를 붙여 타입을 바꿔줌
        //또는 강제 형변환으로 밑처럼 사용
        float f2 = (float)10.1;

        double d1 = 10.1;

        float f3 = (float)d1;
        // 이 경우 d1 뒤에는 f를 붙이지 않고 강제 형변환으로 변환해준다 이미 d1은 더블 타입이기 때문


    }
}
