package com.green.day6.ch4;

public class A_FlowEx23 {
    public static void main(String[] args){
        /*i변수, while을 이용하여 아래처럼 콘솔에 출력되도록 해주세요
        4 - I can do it.
        3 - I can do it.
        2 - I can do it.
        1 - I can do it.
        0 - I can do it.*/

        int i = 5;
        while(i>0){
            System.out.printf("%d - I can do it.\n" ,--i);


        }
    }
}
