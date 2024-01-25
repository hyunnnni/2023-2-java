package com.green.day83;

import java.util.List;

public class GBoxTest {
    public static void main(String[] args) {
        GBox g1 = new GBox();
        g1.setItem(1);
        g1.setItem("우우우");//이런 식으로 사용하는 것이 아닌

        GBox<Integer> g2 = new GBox<>();// 객체화와 동시에 <원하는 타입>을 설정하면
        //컴파일 시점에 <원하는 타입>의 GBox로 컴파일 되는 것이다.
        //그래서 추후 <원하는 타입>에 맞게 set이 가능하며 따로 형변환을 해줄 필요가 없어진다.
        g2.setItem(1);
        g2.setItem(2);
        int intVal = g2.getItem();

        GBox<String> g3 = new GBox<>();
        g3.setItem("하하하");
        String strVal = g3.getItem();

        //제일 큰 예시가 list, 리스트도 컴파일 시점에 타입을 결정할 수 있다
        //<타입 변수>라고 말함
    }
}
