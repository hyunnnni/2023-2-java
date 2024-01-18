package com.green.day68.ch14;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i+10);
        }
        for(Integer val : list){
            System.out.println(val);
        }
        System.out.println("--------------------");
        //forEach메소드의 파라미터는 jdk가 만든 메소드를 하나만 가진 인터페이스를 상속받은 구현부가 있는 클래스의 주소값을 받는다
        list.forEach(new MyConsumer<Integer>());
        System.out.println("--------------------");
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer o) {
                System.out.println("MyConsumer(2) : " + o);
            }
        });
        System.out.println("--------------------");
        list.forEach(i-> System.out.println("MyConsumer(3) : "+i));
        //list의 타입을 보고 자바가 <>타입을 유추하여 객체화해준다
        System.out.println("--------------------");
        list.removeIf((i) -> i%2 == 0);//리턴 메소드인데 {}를 생략하면 return이 자동으로 붙는다 만약 {}를 쓰면 return을 써야한다. (i) -> {return i%2 == 0}
        //리턴타입은 boolean 원본을 건드는 파괴 메소드 2로 나눠져 나머지 값이 0이라면 삭제해버린다
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("--------------");
        list.replaceAll(v-> v <= 15 ? v * 2 : v);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("name", "홍길동");
        map.put("age", "23세");
        map.put("height", "172cm");

        map.forEach( (k, v) -> System.out.printf("%s : %s\n", k, v));
        //BiConsumer 타입 여기서 Bi는 2개라는 의미여서 파라미터가 2개인 consumer를 뜻한다
    }
}

class MyConsumer<T> implements Consumer<T>{ // 객체화 할 때 <원하는 타입 >을 적으면 원하는 타입이 T로 들어오게 된다
    //이것을 제네릭...?Generic이라고 한다 유연한 프로그래밍 가능
    //객체화 시점에 타입을 정할 수 있다
    @Override
    public void accept(T o){
        System.out.println("MyConsumer(1) : " + o);
    }
}