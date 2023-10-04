package com.green.day6.ch4;

import java.util.Scanner;

public class B_DoWhile {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        /*System.out.println("1~100 사이의 숫자 입력 (종료:0) >> ");
        int input = scan.nextInt(); //while문 ()의 값이 true인지 확인을 해야 실행이 되기에 먼저 스캔을 받고 한 번더 while문 안에 적어준다

        while(input != 0){
            System.out.println("1~100 사이의 숫자 입력 (종료:0) >> ");
            int input = scan.nextInt();

        }*/
        int sum = 0;
        int input = 1;


        while(input != 0){
            System.out.println("1~100 사이의 숫자 입력 (종료:0) >> ");
            input = scan.nextInt();
            sum += input;

        }

        System.out.println("끝!!" +sum);


        //do while문

        int sum1 = 0;
        int input1 = 0;


        do{ //최초 한 번 실행된다
            System.out.println("1~100 사이의 숫자 입력 (종료:0) >> ");
            input = scan.nextInt();
            sum += input;
        }while(input != 0);// 그 이후 체크한다 두 번째 부터는 true일 경우 반복 false면 빠져나온다
        System.out.println("끝!!" +sum);
    }
}
