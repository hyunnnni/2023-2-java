package com.green.day20.ch8;

public class ExceptionEx12 {
    public static void main(String[] args) {
        //method1();
        try {
            method2();
        }catch (Exception e){
            System.out.println("metho2 예외발생");
        }
    }
    static void method1(){
        int a =10/0;
    }
    static void method2() throws Exception{ //throws는 Exception을 여러 개 던질 수 있다
        int a =10/0; //메소드 뒤에 throws Exception가 있으면
    }
}

class ExceptionEx12_2{
    public static void main(String[] args) {//한 곳으로 예외처리를 모으는 방식
        //메인 메소드에서는 try로 처리해줘야 한다 더 이상 보낼 곳이 없으니
        //빨간 줄이 뜰 때 마우스를 올리면 Alt+엔터 누르고 Surround with try/catch 자동으로 만들어준다

        try {
            method1();
        } catch (Exception e) {

        }

    }
    static void method1() throws Exception{
        method2();
    }
    static void method2() throws Exception{
        int a = 10/0;
    }
}
