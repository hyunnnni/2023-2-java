package com.green.day4.ch4;

import java.util.Scanner;

public class B_If1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("성별을 입력해주세요 (여자,남자) > ");

        String input = scan.nextLine();

        /*if ( "여자" .equals(input)){
            System.out.println("예쁘다.");
        }else if ( "남자" .equals(input)) {
            System.out.println("잘 생겼다.");
        }else {
            System.out.println("누구냐.");
        }*/
//-------------------------------------------------------------------------------
       /* if ("여자".equals(input)){
            System.out.println("예쁘다.");
        }else {
            System.out.println("남자".equals(input) ? "잘생겼다" : "누구냐");
        }*/
        //-----------------------------------------------------------------------

        String w ="예쁘다";
        String m = "잘 생겼다";
        String who = "누구냐";

        System.out.printf("%s", ("여자".equals(input) || "남자".equals(input) ? ("여자".equals(input) ? w : m ) : who ));
        //                    ,%s에 들어갈 string || ←둘 중 하나라도 참이면 나오게 됨,   ↑이 괄호 먼저 진행 ↑

    }
}
