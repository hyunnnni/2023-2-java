package com.green.day3.ch4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FlowEx2_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // 입력을 나오게 하는
        System.out.print("숫자를 하나 입력하세요 > "); //입력한 값은 문자형
        String input = scan.nextLine(); //String 변수에 해당값이 저장
        int num = Integer.parseInt(input); //문자열을 메소드(Integer.parseInt)를 이용해 정수형으로 변환

        if ( num != 0 ) {
            System.out.println("입력하신 숫자는 0이 아닙니다"); //해당 숫자가 0이 아니라면
            System.out.printf ("입력하신 숫자는 %d 입니다" , num);
        } else {
            System.out.println("입력하신 숫자는 0입니다");
        }

        //if (num == 0) {System.out.println(" 입력하신 숫자는 0입니다");}
        // else {System.out.println("입력하신 숫자는 0이 아닙니다");}
        //이렇게만 적어도 됨 else (이거 외 전부 나머지) 사용하게 되면 무조건 하나는 출력되게 됨

    }
}
