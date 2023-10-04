package com.green.day3.ch4;

import java.util.Scanner;

public class OperatorEx32_M {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("값을 입력하세요 > ");

        String input = scan.nextLine();
        int n = Integer.parseInt(input);

        /*if (n < 0) {
            System.out.println("n : " + -n + "이다.");
        } else {
            System.out.printf("n : %d이다.", n); */

            System.out.printf( " n : %d ", n < 0 ? -n : n);
        }
    }

