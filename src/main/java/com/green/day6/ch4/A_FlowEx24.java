package com.green.day6.ch4;

public class A_FlowEx24 {
    public static void main(String[] args){
        int i = 11;
        System.out.println("카운트다운을 시작합니다");
        while(i-- != 0) {
            System.out.println(i);

            for(int s= 0; s < 2_000_000_000; s++ ){

            }
        }
        System.out.println("Launch!!");
    }
}
