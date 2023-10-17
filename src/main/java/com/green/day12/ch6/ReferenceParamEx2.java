package com.green.day12.ch6;



public class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] x = {10};//배열도 주소값 개념이기 때문에 DiffPriRef와 같은 결과
        System.out.printf("main() : x = %d\n" , x[0]);
        int r = 5;
        change(r);
        change(x);
        System.out.printf("main() : x = %d\n" , x[0]);
    }

    public static void change(int[] num){

        num[0] = 1000;
        System.out.printf("change() : x = %d\n" , num[0]);
    }

    static void change(int num){
        num = 300;
        System.out.printf("change3 : x = %d\n" , num);
    }
}
