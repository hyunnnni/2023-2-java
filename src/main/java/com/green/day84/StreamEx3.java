package com.green.day84;

import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        Stream.iterate(0, item -> item + 2)
                .mapToInt(Integer::valueOf)
                //.mapToInt(item -> {return Integer.valueOf(item);}); 같은 의미
                .skip(3)//3개는 스킵하겠다라는 의미
                .limit(10)
                .boxed()
                .forEach(System.out::println);
                //.forEach(item -> System.out.print(item)); 가공이 들어간 결과값을 쓰고 싶다면 사용하면 된다.
        //무한 스트림을 만들어준다.
        //return 0 + 2
        //return 2 + 2
        //return 4 + 2
        //return 6 + 2 이런식으로 무한으로 돌아간다.
    }
}
