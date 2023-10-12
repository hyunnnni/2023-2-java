package com.green.day10.ch6;

public class TvTest {
    public static void main(String[] args){
        /*
        c언어는 절차지향언어 작은 소프트웨어(임베디드) 만들 때 사용하기 좋다
        또 계산이 많이 필요할 때 쓴다
        자바는 객체지향언어이다 (c++, c#, javascrip)

        객체는 두 가지로 이루어져있다 (속성과 메소드)
        속성(명사담당)
        메소드(동사담당)

        메인메소드가 없으면 아무것도 실행이 안된다 동작하기 위해 있어야 한다
        보통은 프로젝트 하나당 메인 메소드는 하나면 충분하다
        ---------------------------------------------------------------
        클래스(문서나 설계도)
        -설명글 ex) 이게 동작할려면 이러이러하게 해야해 객체를 만드는 문서
        객체(tv나 아파트) = object, instance
        -설계대로 동작된 것
        ----------------------------------------------------------------
        steck 메모리
        - FILO(first in last out)
        제일 먼저 들어간 게 제일 마지막에 나온다 컵느낌
        heap메모리 영역
        - FIFO(first in first out)
        제일 먼저 들어간 게 제일 먼저 나온다 터널 느낌
        ----------------------------------------------------------------
        이때 Tv tv1과 Tv tv2는 steck에 저장

        Tv
        ---
        channel
        color        ←이거는 heap에 주소를 가지며 저장(이거의 주소를 tv1에 저장해서 언제든지 여기에 접근할 수 있게함)
        power
        ---
        메소드

         */
        Tv tv1 = new Tv();//인스턴스 : 클래스의 정의를 통해 만들어진 객체
        //Tv의 객체의 주소값을 담을 수 있는 레퍼런스 (참조형)+ 변수 이름  = 새로운 걸 만들었다+ 클래스명(); ← 이게 객체주소값
        //여기서 =은 주소값을 복사해서 Tv tv1에 넣어라라는 뜻
        //Tv 객체의 주소값을 담을 수 있다. Tv는 타입, 대문자로 시작하면 객체의 주소값을 담을 수 있다
        tv1.channel =10; //tv1에 접근할 땐 .을 사용한다( 주소값. = 이 객체 접근한다)
        tv1.power = true;
        tv1.color = "빨간색";



        Tv tv2 = new Tv();
        tv2.channel = 20;

        System.out.println("tv1.channel : "+tv1.channel);
        System.out.println("tv1.power : "+tv1.power);
        System.out.println("tv1.color : "+tv1.color);

        System.out.println("tv2.channel : "+tv2.channel);
        System.out.println("tv2.power : "+tv2.power);//값을 넣지 않아도 디폴트값이 존재 배열처럼 (기본형만 있음)
        System.out.println("tv2.color : "+tv2.color);//참조형(레퍼런스)의 디폴트값은 null만 뜬다(주소값을 갖고있지 않다)

    }
}
