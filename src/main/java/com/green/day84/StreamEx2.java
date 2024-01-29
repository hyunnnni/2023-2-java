package com.green.day84;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamEx2 {
    public static void main(String[] args) {
        Random r = new Random();

        IntStream intStream = r.ints();
        intStream.limit(10).forEach(System.out::println);

        System.out.println("---------------");
        r.ints(10).forEach(System.out::println);

        System.out.println("---------------");
        r.doubles(10).forEach(System.out::println);

        System.out.println("-------랜덤 1-10 숫자, 5개 추출--------") ;

        List<Integer> intList = r.doubles()
                                    .mapToInt(item ->(int)(item * 10) + 1)
                                    .boxed()//int를 Integer로 바꾼 후
                                    .distinct()//중복제거
                                    .limit(5)//5개로 자른 뒤
                                    .collect(Collectors.toList());//리스트로 바꿔주었다
        System.out.println(intList);

        System.out.println("-------랜덤 1-45 숫자, 6개 추출--------") ;

        r.ints(1, 46)
                                .distinct()
                                .limit(6)
                                .sorted()
                                .forEach(item -> System.out.print(item + ","));
        System.out.println("\n끝");
    }

}
