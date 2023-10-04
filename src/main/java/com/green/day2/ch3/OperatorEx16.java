package com.green.day2.Ch3;

public class OperatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        //.을 뒤로 옮겨서 그 수만큼 표시하고 싶거나 원하는 자릿 수 까지 표현하기 위해
        System.out.println(pi);

        int pro1 = (int)(pi * 1000);
        System.out.println("pro1 : " + pro1);

        float  pro2  = pro1 / 1000f; // 여기서 / 말고 * 0.001을 사용하면 더 빠르게 계산
        System.out.println("pro2 : " + pro2);

        System.out.println( "one :  "+ (int)(pi * 1000));

    }
}
