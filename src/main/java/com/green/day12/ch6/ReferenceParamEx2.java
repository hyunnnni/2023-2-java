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

    public static void change(int[] num){//같은 클래스 안에서 메소드를 쓰기 위해서는 메소드 앞에 static을 사용하면 된다
        //public은 다른 패키지에서 메소드를 가지고 오고 싶을 때 적어야 함
        num[0] = 1000;
        System.out.printf("change() : x = %d\n" , num[0]);
    }

    static void change(int num){
        num = 300;
        System.out.printf("change3 : x = %d\n" , num);
    }
}
