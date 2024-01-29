package com.green.day84;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        int[] intArr = { 10, 2, 22, 80, 90, 33};
        Integer[] integerArr = {55, 10, 2, 22, 80, 90, 33};

        //Stream<Integer> stream1 = Arrays.stream(intArr).boxed(); 이게 더 유연함
        Stream<Integer> stream2 = IntStream.of(intArr).boxed();
        Stream<Integer> stream3 = Stream.of(integerArr);


        List<Integer> list = stream2.sorted().limit(3).collect(Collectors.toList());

        //sorted() = 정렬해주는 메소드 :중간 연산
        //limit() = 이 스트림의 길이를 3까지 잘라주는 메소드 : 중간 연산
        //현재 중간 연산으로는 순서에 따라 값이 달라져 순서도 중요하다
        //collect() = 콜렉션으로 다시 만들어주는 작업 그 중 리스트로 만들어줌 : 최종 연산
        //중간 연산은 꼭 최종 연산도 같이 진행이 되어야 실행이 된다

        IntStream.of(intArr).boxed()//primotive타입만 boxed를 쓸 수 있다 스트림 만드는 부분
                            .sorted()//중.연
                            .limit(4)//중.연
                            .forEach(item -> System.out.println(item));//최.연

        System.out.println(list);
        System.out.println(Arrays.toString(intArr));// 원본은 바뀌지 않는다.



    }
}
