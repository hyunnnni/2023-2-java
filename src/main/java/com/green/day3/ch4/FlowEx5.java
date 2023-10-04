package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요 > ");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

    /*  if (score >= 90) {//A

            if (score >= 98) {
                System.out.println("A+학점");
            } else if (score <= 93) {
                System.out.println("A-학점");
            } else {
                System.out.println("A학점");
            }

       } else if (score >= 80) {//B

           if (score >= 88) {
               System.out.println("B+학점");
           } else if (score <= 83) {
               System.out.println("B-학점");
           } else {
               System.out.println("B학점");
           }

       } else if (score < 80) {//C
           System.out.println("C학점");
       }
       */

       /* ----------------------------------------------------------------------
          String grade = "C";

        if (score >= 90 ) {
            if (score >= 98) {
                grade = "A+";
            } else if (score <= 93) {
                grade = "A-";
            } else {
                grade = "A";
            }
        } else if (score >= 80) {
                if (score >= 88) {
                    grade = "B+";
                }
                else if (score <= 83) {
                    grade = "B-";
                } else {
                    grade = "B";
                }
            }
        System.out.printf("%s학점 입니다", grade);
        */

       /* --------------------------------------------------------------

       String grade = "C";
        String opt = "";

        if (score >= 90) {
            grade = "A";
            if (score >= 98) {
                opt = "+";
            } else if (score <= 93) {
                opt = "-";
            }
        } else if (score >= 80) {
            grade = "B";
            if (score >= 88) {
                opt = "+";
            } else if (score <= 83) {
                opt = "-";
            }
        }
        System.out.printf("%s%S학점 입니다", grade, opt);
        ------------------------------------------------------------------------*/

        String grade = "C";
        String opt = "";//빈칸일 때 출력값에 영향을 주지 않음

        if (score >= 90) {//grade의 값을 출력
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        }
        if (score >= 80) {//B학점 이상 일 때만  +-가 들어가야하니 if문 사용 , +-의 값을 출력
            int rMod = score % 10; //나머지가 rMod에 들어간다 나머지 1자리 숫자를 얻을 수 있음
            if (rMod >= 8 || score == 100) {// rMod에 들어간 값이 8과 같거나 클 때 or(||) score가 100일 때
                opt = "+";
            } else if (rMod <= 3) {
                opt = "-";
                System.out.printf("%s%s학점 입니다", grade, opt);
            }
            //이게 제일 정리가 잘 된 경우
        }
    }
}

