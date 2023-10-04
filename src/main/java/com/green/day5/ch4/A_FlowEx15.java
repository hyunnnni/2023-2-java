package com.green.day5.ch4;

public class A_FlowEx15 {
    public static void main(String[] args) {
        final int DAN = 8;
        /*
        반복문 사용해서
        곱하기
         */

        /*for(int i = 1; i < 10 ; i++){
            int sum = DAN*i;

            System.out.printf( "%d X %d = %d\n" , DAN, i, sum );
        }*/

        for(int i = 1; i < 10 ; i++){
            System.out.printf( "%d X %d = %d\n" , DAN, i, DAN * i );
        }

    }
}
