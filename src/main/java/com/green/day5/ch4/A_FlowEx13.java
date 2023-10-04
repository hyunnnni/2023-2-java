package com.green.day5.ch4;

public class A_FlowEx13 {
    public static void main (String[] args){
        //반복문을 사용하여 1~10을 전부 더한 값을 출력
        int sum = 0;

    /*for (int i = 1; i < 11 ; i++){//int i는 for문 안에서만 사용가능 이 스코프안에서만 가능
        //sum =sum + i;
        sum += i;
        System.out.printf("i: %d , sum : %d \n", i, sum );
    }*/

        for (int i = 1; i < 11 ; i++){
            //sum =sum + i;
            sum += i;
        }
        System.out.println( "sum : " + sum);
    }
}
