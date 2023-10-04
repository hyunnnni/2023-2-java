package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 하나 입력하세요");

        int num = scan.nextInt(); //바로 정수로 받음
        //String input = scan.nextLine();
        //int num = Integer.parseInt(input);

        if (num % 2 == 0) {System.out.printf("%d은/는 짝수입니다", num);}
        if (num % 2 == 1) {System.out.printf("%d은/는 홀수입니다", num);}




    }
}
