package com.green.day10.ch6;

public class NumberBoxTest {
    public static void main(String[] args){
        NumberBox nb1 = new NumberBox();
        //NumberBox의 객체주소값의 이름  = 새로운 걸 만들었다 클래스명(); ← 이게 객체주소값

        nb1.sum(10,20); //메소드를 사용한 부분 ()안은 아규먼트..?라고 함..
        nb1.sum(30,40); //호출하고 정의하는 부분을 제대로 구분하기 같이 하면 안된다

    }
}
