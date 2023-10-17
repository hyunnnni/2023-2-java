package com.green.day13.ch6;

public class VarArgEx {


    public static void sum(int...n){ // 컴파일러가 값을 가지고 와서 배열로 넣어준다 < 가변인자
        System.out.println("배열의 길이 : " + n.length);
        int sum = 0;
        for(int i = 0; i<n.length; i++){
            sum += n[i];
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        sum(10, 20); //같은 공간의 static메소드를 쓰고 있어서 sum 앞에 .이 생략되어있음
        sum(10, 20, 30);
        sum(10, 20,30,40);
    }
}
