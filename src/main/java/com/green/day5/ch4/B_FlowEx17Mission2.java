package com.green.day5.ch4;

import java.util.Scanner;

public class B_FlowEx17Mission2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*을 출력할 라인의 수를 입력하세요 >> ");
        int line = scan.nextInt();

        /* 5를 넣었을 때
        ____*
        ___**
        __***
        _****
        *****
         */

        //반복문만 사용

        for (int i = 1; i <= line; i++) {
            for (int z = line - i; z > 0; z--) {
                System.out.print("_");
            }
            for (int y = 0; y < i; y++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //for문과 if문을 같이 사용

        for (int i = line; i > 0; i--) {
            for (int z = 1; z <= line; z++) {
                if (z < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //for문에서 삼항식 사용하기

        for (int i = line; i > 0  ; i-- ){
            for (int z = 1 ; z <= line; z++){
                System.out.print( z < i ? "_":"*");
            }
            System.out.println();
        }
    }
}
