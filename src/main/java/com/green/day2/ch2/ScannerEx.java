package com.green.day2.Ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 하나 입력해주세요 >> ");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);
        //단순히 int num2 = (int) intput으로는 강제 형변환이 되지 않는다 String이 더 강하기 때문



        System.out.println("입력내용: " + input);
        System.out.printf("num=%d\n" , num);

        System.out.println("입력내용: " + (input +input));
        System.out.printf("num=%d\n" , (num + num));
    }
}
