package com.green.day2.Ch3;

public class OperatorEx18 {
    public static void main(String[] args) {
        float f1 = 15.1f, f2 = 15.6f, f3 = 15.9f;

        //ceil : 올림처리 .1이어도 윗자리로 올려줌 0을 제외 조금이라도 있으면 올려줌

        System.out.printf("ceil(%f): %f\n", f1, Math.ceil(f1));
        System.out.printf("ceil(%f): %f\n", f2, Math.ceil(f2));
        System.out.printf("ceil(%f): %f\n", f3, Math.ceil(f3));

        //floor : 내림처리
        System.out.printf("floor(%f): %f\n", f1, Math.floor(f1));
        System.out.printf("floor(%f): %f\n", f2, Math.floor(f2));
        System.out.printf("floor(%f): %f\n", f3, Math.floor(f3));

        //round : 반올림 .5이상 값은 올려줌 ( 반올림이 되어 정수가 되기 때문에 %d 사용)
        System.out.printf("round(%f): %d\n", f1, Math.round(f1));
        System.out.printf("round(%f): %d\n", f2, Math.round(f2));
        System.out.printf("round(%f): %d\n", f3, Math.round(f3));
        System.out.printf("round(%f): %d\n", 15.09, Math.round(15.09));
        System.out.printf("round(%f): %d\n", 15.49, Math.round(15.49));

    }
}
