package com.green.day4.ch4;

import java.util.Scanner;

public class B_If2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("성별을 입력해주세요 > ");

        String gen = scan.nextLine();

        String msg = "누구냐.";


        if ("여자".equals(gen)||"여".equals(gen)||"woman".equals(gen)||"Woman".equals(gen)) {
            msg = "예쁘다.";
        } else if ("남자".equals(gen)||"남".equals(gen)||"man".equals(gen)||"Man".equals(gen)){
            msg = "잘 생겼다.";
        }
            System.out.println(msg);
    }
}
