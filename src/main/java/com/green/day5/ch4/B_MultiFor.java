package com.green.day5.ch4;

public class B_MultiFor {
    public static void main(String[] args){
        for(int  h = 0; h<10; h++){

            for (int m = 0; m<7; m++){
                System.out.printf("h : %d - m : %d\n", h, m); //이 for문이 끝나야 바깥 for문이 끝남
                //제일 안 쪽 for문 먼저 다 수행
            }
        }
    }
}
