package com.green.day13.ch6;

public class MyMath2 {
    int num;//인스턴스 변수(객체화를 해야 쓸 수 있으니깐)
    //이건 객체화가 된다면 int num이 될 수 있다는거다 설계 즉 구조만 한 것

    static int staticNum;//static붙은 건 무조건 공간이 하나 객체 생성과 연관이 없다
    //객체 생성을 여러 개 해도 상관이 없다
    //객체를 아무리 만들어도 .static을 쓰면 공간은 하나다
    //static 클래스는 클래스가 메모리에 올라갈 때 이미 자동적으로 생성된다 인스턴스를 따로 생성하지 않아도 됨
    //객체화하지 않아도 메모리에 올라가는 친구

    static void print(){//클래스 메서드는 인스턴스 변수를 사용할 수 없다

        System.out.printf("staticNum : %d\n", MyMath2.staticNum);//, num 이걸 쓸 수 없다
        //클래스 메소드에서 인스턴스 메소드도 호출하지 못한다
    }

    void print2(){//그냥 일반 메소드에서는 static을 사용할 수 있다
        //인스턴스 메소드에서는 클래스 메소드를 호출할 수 있다
        System.out.printf("staticNum : %d, num : %d\n", staticNum, num);//staticNum 적을 때 같은 공간에 있다면 MyMath. 이 생략되어있음
    } //보통 인스턴스 변수를 사용해서 이렇게 작성하지만 static메소드를 사용하는게 좋다 권장~ 속도가 더 빨라진다
    //더 줄여쓸 수도 있고 String.valueOf(); 이게 static메소드

    public static void staticAbs(int a){
        System.out.println(a);
    }
}
