package com.green.day2.Ch2;

public class CastingEx1 {
    public static void main(String[] args){
        double d = 85.4;
        int score = (int)d; //강제 형변환
        System.out.println("score : " + score);
        System.out.println("d : " + d);

        // 작은 수를 큰 변수로 넣는 건 문제가 안됨 자동 형변환

        byte b1 = 127;
        short s1 = b1;

        //실수에 정수를 넣는 건 가능, 정수에 실수 넣는 건 강제 형변환이 필요

        float f1 = s1;
        int i1 = (int)f1;

    }
}
