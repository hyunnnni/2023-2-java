package com.green.day10.ch6;

public class C_MethodExam {
    /*void checkZero (int n){
        if( n == 0 ){
            System.out.println("0입니다.");
            return;
        }
         System.out.println("0이 아닙니다.");
    }*/

   void checkZero (int n){
        System.out.println( n == 0 ? "0입니다." : "0이 아닙니다.");
   }

   int randomValFromTo(int n1, int n2){
       return (int)(Math.random()* (n2-n1+1))+n1;
   }

   void scoreResultPrint(int n){
       if(n<0 || n>100){
           System.out.println("잘못된 점수입니다.");
           return; //리턴 붙이기
       }
       String grade = "D";//간결하게 만들기 위해

       if( n >= 90){
           grade = "A";
       } else if( n >= 80 ){
           grade = "B";
       } else if ( n >= 70 ) {
           grade = "C";
       }
       System.out.printf("%s학점\n", grade);
   }
}
