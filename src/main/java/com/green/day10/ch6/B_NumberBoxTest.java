package com.green.day10.ch6;

public class B_NumberBoxTest {
    public static void main(String[] args){
        B_NumberBox nb1 = new B_NumberBox();
        //NumberBox의 객체의 주소값을 담을 수 있는 레퍼런스 변수 이름  = 새로운 걸 만들었다 클래스명(); ← 이게 객체주소값

        //     (n1, n2)
        nb1.sum(10,20); //메소드를 사용한 부분 ()안은 아규먼트..?라고 함..
        nb1.sum(30,40); //호출하고 정의하는 부분을 제대로 구분하기 같이 하면 안된다

        nb1.minus(40, 20);

        nb1.abs(-10);
        nb1.abs(10);
        nb1.abs(-33);
        nb1.abs(39);
    }
}
