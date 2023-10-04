package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요 > ");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        char grade = 'D'; //마지막 else를 쓰지 않아도 되게 함

        if( score >= 90 ) {//만약 score가 90 이상이면 grade가 'A'가 되게 하자
            grade = 'A';
        }
        else if(score >= 80) {
            grade = 'B';
        }
        else if(score >= 70) {
            grade = 'C';
        }

        System.out.printf("%c학점\n", grade);

        //중복이 많기 때문에 위 처럼 줄임 더 나은 소스

       /* if ( score >= 90 ) {
            System.out.println("A학점");}
        else if(score >= 80) {
            System.out.println("B학점");}
        else if(score >= 70) {
            System.out.println("c학점");}
        else {
            System.out.println("D학점");} */

    }
}
