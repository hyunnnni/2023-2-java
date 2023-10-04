package com.green.day4.ch4;

public class C_If3 {
    public static void main(String[] args) {
        int val = (int)(Math.random()*100)+1;

      /*  String n = "홀수";
        if( val % 2 == 0 ) {
            n = "짝수";
        }
        System.out.printf("%d 은(는) %s입니다" , val, n);*/

        System.out.printf( "%d 은(는) %s입니다" ,val, val % 2 == 0 ? "짝수" : "홀수");
    }
}
