package com.green.day84;

import java.util.*;

public class StreamEx5 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(new Integer[]{ 100, 1, 8, 10, 22});
        int sum = intList.stream().mapToInt(item -> item).sum();//타입을 int로 바꿔주어야 sum을 사용할 수 있다
        System.out.println("sum : "+ sum);

        OptionalDouble avg = intList.stream(). mapToInt(item -> item).average();//average 평균값 구함
        //Optional~~ : null체크를 좀 더 매끄럽게 해주는 역할 null이 안 들어감
        if(avg.isPresent()){
            System.out.println("avg : " + avg.getAsDouble());
        }
        double avg2 = Optional.of(avg).map(item -> item.getAsDouble()).orElse(0.0);
        System.out.println("avg : "+ avg2);
    }
}
