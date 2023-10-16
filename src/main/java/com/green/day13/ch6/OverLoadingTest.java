package com.green.day13.ch6;

public class OverLoadingTest {
    public static void main(String[] args) {
        System.out.println();
    }
    void print() {}

    void print(int n){}
    void print(int n,int n2){}

    void print(int n1, String str2) {}  //다른 메소드들과 구분이 된다면 (매개변수) 오버로딩은 얼마든지 만들 수 있다
    //하나의 이름으로 정할 수 있어서 고민이 적어 좋다
}
