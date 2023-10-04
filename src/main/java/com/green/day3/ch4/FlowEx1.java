package com.green.day3.ch4;

public class FlowEx1 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x=%d 일 때, 참인 것은\n", x);

        if (x == 0) {
            System.out.println("x == 0");
        }
        //조건문 ()안에 비교문을 넣는다 타입은 무조건 boolean
        // System.out.println에서 {}를 빼면 오류가 날 수도 있어서 넣어서 사용
        // true면 그대로 실행이 됨

        if (x != 0) {System.out.println("x != 0");}
        //false면 계산하지않고 그냥 지나감

        System.out.println("-----------------");

        x = 1;
        System.out.printf("x=%d 일 때, 참인 것은\n", x);
        if (x == 0) {System.out.println("x == 0");}
        if (x != 0) {System.out.println("x != 0");}
        if ( !(x == 0) ) {System.out.println("!(x == 0)");} //이 연산의 결과를 반대로 간다 > false
        if ( !(x != 0) ) {System.out.println("!(x != 0)");} //부정의 부정 > true

        System.out.println("끝");
    }
}