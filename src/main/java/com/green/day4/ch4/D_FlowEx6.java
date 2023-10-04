package com.green.day4.ch4;

import java.util.Scanner;

public class D_FlowEx6 {
    public static void main(String[] args){
        System.out.print("현재 월을 입력하세요 >> ");

        Scanner scan = new Scanner(System.in);
        int mon = scan.nextInt();

        switch (mon){
            case 3,4,5 :
                System.out.printf("%d월 현재의 계절은 봄입니다.", mon);
                break;
            case 6,7,8 :
                System.out.printf("%d월 현재의 계절은 여름입니다.", mon);
                break;
            case 9,10,11 :
                System.out.printf("%d월 현재의 계절은 가을입니다.", mon);
                break;
            case 12,1,2:
                System.out.printf("%d월 현재의 계절은 겨울입니다.", mon);
                break;
            default:
                System.out.printf("%d월은 없는 날짜입니다.", mon);
                break;
        }
    }
}
