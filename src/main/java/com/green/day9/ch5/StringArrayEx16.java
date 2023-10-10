package com.green.day9.ch5;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrayEx16 {
    public static void main(String[] args){
        //3개의 string값을 담을 수 있는 배열을 생성
        //3번 문자열로 입력을 받는다(Scanner이용)
        //입력받은 문자열들을 순차적으로 배열에 값을 넣는다
        //값 넣는게 종료가 되면 향상된 for문을 이용하여 저장되어있는 값들을 콘솔에 출력한다.

        Scanner scan = new Scanner(System.in);

        final int LEN = 3;

        String[] arr = new String[LEN];

        for(int i = 0; i < arr.length; i++){
            System.out.println("문자를 입력해주세요 >> ");
            String a = scan.nextLine();
            arr[i] = a;
        }

        for(String str : arr){
            System.out.println(str);
        }
        System.out.println(Arrays.toString(arr));
    }
}
