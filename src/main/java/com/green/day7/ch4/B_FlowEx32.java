package com.green.day7.ch4;

import java.util.Scanner;

public class B_FlowEx32 {
    public static void main(String[] args) {
        /*
        (1)spuare
        (2)tri
        (3)log
        원하는 메뉴를 선택하세요 (1~3) 종료(0) >>
        메뉴 선택 시 선택하신 메뉴는 @번입니다.
        다른 숫자 입력 시 메뉴를 잘못 선택하셨습니다
        0입력시 종료합니다
         */
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("(1)spuare\n(2)tri\n(3)log\n원하는 메뉴를 선택하세요 (1~3) 종료(0) >> ");

            int menu = scan.nextInt();

            if (menu == 0) {
                break;
            } else if (menu < 1 || menu > 3) {
                System.out.println("메뉴를 잘못 선택하셨습니다");
            } else {
                System.out.printf("선택하신 메뉴는 %d번 입니다\n", menu);
            }
        }
        System.out.println("프로그램을 종료합니다");
    }
}
