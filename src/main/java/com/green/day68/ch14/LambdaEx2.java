package com.green.day68.ch14;

@FunctionalInterface
interface MyFunction2{
    void myMethod();
}
public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction2 mf0 = () -> { System.out.println("안녕하시렵니까");};
        mf0.myMethod();
    }
}
