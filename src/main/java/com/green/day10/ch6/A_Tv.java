package com.green.day10.ch6;

public class A_Tv {//Tv가 클래스명 이걸 객체화 하기위해 new를 쓰고 Tv를 쓰면 객체가 된다
    //멤버필드, 속성, propecty
    //변수선언이 되어야 속성이 있다고 할 수 있다
    String color;
    boolean power;
    int channel;

    //멤버메소드, 메소드
    //void= 리턴타입 그 뒤는 메소드명, () = 파라미터 (매개변수) 구성은 이렇게 3개가 꼭 있어야 함
    void power() {power =!power;} //메소드를 정의했다  void power()까지는 메소드의 선언부 뒤의 {}는 구현부라고 하며 나눈다
    //선언부는 필수지만 구현부는 없을 수도 있다. 이건 만드는 거 선언, 쓰기
    void channelUp(){ channel++; }
    void channelDown() { channel--;}

    //메소드를 만드는 이유 = 나중에 계속 사용하고 수정하기 용이할려고 만들어 놓는다
    //

}
