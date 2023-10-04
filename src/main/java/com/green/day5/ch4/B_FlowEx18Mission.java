package com.green.day5.ch4;

public class B_FlowEx18Mission {
    public static void main (String[] args) {
        //옆으로 정리된 구구단
       for(int i = 1; i < 10; i++){

           for(int z = 2; z < 10;z++){
               System.out.printf("%d X %d = %d\t", z , i , z*i);
           }
           System.out.println();
       }
    }
}
