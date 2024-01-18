package com.green.day68.ch14;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReference {//메소드 참조 일반적으로 적는 거만 가능
    public static void main(String[] args) {
        Function<String, Integer> f = v -> Integer.parseInt(v);
        //<파라미터의 타입, 메소드의 리턴 타입>
        Function<String, Integer> f2 = Integer::parseInt;
        //위의 코드를 줄인 것 이때 parseInt의 파라미터에 가공이 필요하다면 사용이 안된다.

        System.out.println(f.apply("12")+1);
        System.out.println(f2.apply("12")+1);

        BiFunction<String, String, Boolean> bf = (s1, s2) -> s1.equals(s2);
        BiFunction<String, String, Boolean> bf2 = String::equals;

        String s1 = new String("안녕");
        String s2 = new String("안녕");
        System.out.println("s1 == s1 : "+ (s1 == s2));
        System.out.println(bf.apply(s1, s2));
        System.out.println(bf2.apply(s1, s2));
    }
}
