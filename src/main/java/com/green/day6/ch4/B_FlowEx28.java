package com.green.day6.ch4;

import java.util.Scanner;

public class B_FlowEx28 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int input = 0;
        int answer = (int)(Math.random() * 100 )+1;
        //System.out.println("answer : "+ answer);
        /*
        1~100 사이의 정수를 입력하세요 >>
        내가 임의로 정한 숫자보다 정답이 크다 > up
        입력한 숫자보다 정답이 작다 > down
        맞출 때가지 반복
         */

        while (true) {
            System.out.println("1~100 사이의 정수를 입력하세요 >> ");
            input = scan.nextInt();
            if (input < answer){
                System.out.println("up");
            }else if(input > answer){
                System.out.println("down");
            }else if(input == answer){
                break;
            }

        }
        System.out.println("정답입니다");




















      /*  while(input != answer){
            System.out.println("1~100 사이의 정수를 입력해서 맞춰보세요!");
            input = scan.nextInt();
            if(input < answer){
                System.out.println("up");
            }else if(input > answer){
                System.out.println("down");
            }
        }
        System.out.println("정답입니다");*/
    }
}
