package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 하나 입력하세요 > ");

        String input = scan.nextLine(); //문자열을 변형하는 이유는 숫자 외 다른 걸 입력했을 때
        // 이 부분에서 분류가 가능하기 때문 바로 정수로 받게되면 멈추게 됨
        int num = Integer.parseInt(input);

        if ( num == 0 ) {
            System.out.println( "이 값은 0입니다. 다른 값을 입력해주세요");
        } else {
            if (num % 2 == 0) {
                System.out.printf("%d 은/는 짝수입니다." , num);
            } else {
                System.out.printf("%d 은/는 홀수입니다." , num);
            }
        }

        //if (num % 2 == 0) {System.out.printf("%d은/는 짝수입니다", num);}
        //else {System.out.printf("%d은/는 홀수입니다", num);}
        //if는 중첩이 된다 if안에 if안에 if안에 똑~또~!

    }
}