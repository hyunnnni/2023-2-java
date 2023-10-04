package com.green.day6.ch4;

import java.util.Scanner;

public class B_DoWhile2 {
    public static void main (String[] args){//p.173
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int input = 0;
        while(true) { //무한으로 진행됨
            System.out.println("1~100 사이의 숫자 입력 (종료:0) >> ");
            input = scan.nextInt();
            if(input == 0) {
                break;
            }
            sum += input;
        }
        System.out.println("끝!!" +sum);
    }
}
