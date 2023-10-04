package com.green.day4.ch4;

import java.util.Scanner;

public class Hehehe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("전화번호를 입력해주세요 (010-1234-5678 하이픈 포함) ");

       /* String pNum = scan.nextLine();
        char fNum = pNum.charAt(12);
        String space = "B";

        int num = Character.getNumericValue(fNum);

        if (num <= 5) {
            space ="A";
        }
        System.out.printf("%s공간에서 대기해주세요.", space);*/

        String pNum = scan.nextLine();
        char fNum = pNum.charAt(12);

        String space = (Character.getNumericValue(fNum) <= 5) ? "A" : "B";
        //Charater.getNumericValue 는 char였던 fNum값을 int형으로 바꿔줌
        //단순히 앞에 (int)를 넣거나 자동형변환이 되었을 땐 성립이 되지않음,,,헹,,,
        //char을 String으로 바꾸고 싶다면 String.valueOf()를 사용,,!!

        System.out.printf("%s공간에서 대기해주세요.", space);


        /*char fNum = pNum.charAt(12);

        switch (fNum){
            case '0','1','2','3','4','5' :
                System.out.println("A공간에서 대기해주세요");
                break;
            default:
                System.out.println("B공간에서 대기해주세요");
                break;
        }*/
    }
}
