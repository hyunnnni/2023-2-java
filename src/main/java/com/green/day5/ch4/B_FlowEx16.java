package com.green.day5.ch4;

public class B_FlowEx16 {
    public static void main(String[] args){
        //중첩반복문 사용해 가로 10개 세로 5줄의 별을 찍으시오

        for(int i = 0; i < 5; i++){

            for(int z = 0; z < 10; z++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*for(int i = 1;  i<=10*5; i++){
            System.out.print("*");
            if( i % 10 == 0 ) {
                System.out.println(); //이때 i가 10으로 나눴을 때 나머지가 0이면 엔터를 하라 10, 20, 30 ...
            }
        }  이렇게도 가능 하지만 중첩for문이 가독성도 더 좋고 무튼 더 좋음 */
    }
}
