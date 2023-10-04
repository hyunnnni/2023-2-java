package com.green.day5.ch4;

import java.util.Scanner;

public class B_FlowEx17Mission {
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

      /*  for (int i = 1; i <= line; i++){
            for (int z = line-i ; z > 0; z--){//점점 적게 출력할 땐 --이용해보기 연산을 사용 시 2항보다는 1항에서 사용하는게 좋다
                System.out.print("_");
            }
            for(int y = 0; y < i; y++){
                System.out.print("*");
            }
            System.out.println();
        }*/

       /* for (int i = line; i > 0; i--) {
            for (int z = 1; z <= line; z++) {
                if (z < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }*/
        for (int i = line; i > 0; i--) {
            for (int z = 1; z <= line; z++) {
                System.out.print(z < i ? "_" : "*");
            }
            System.out.println();
        }
    }
}
