package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // 입력을 나오게 하는
        System.out.print("숫자를 하나 입력하세요 > ");
        String input = scan.nextLine(); //String 변수에 해당값이 저장
        int num = Integer.parseInt(input); //문자열을 정수형으로 형변환

        if ( num == 0 ) {System.out.println("입력하신 숫자는 0입니다");} //해당 숫자가 '0이라면' if사용
        if ( num != 0 ) {System.out.println("입력하신 숫자는 0이 아닙니다");} //해당 숫자가 0이 아니라면

        System.out.printf ("입력하신 숫자는 %d 입니다" , num);

        //if (num == 0) {System.out.println(" 입력하신 숫자는 0입니다");}
        // else {System.out.println("입력하신 숫자는 0이 아닙니다");}
        //이렇게만 적어도 됨 else (이거 외 전부 나머지) 사용하게 되면 무조건 하나는 출력되게 됨

    }
}
