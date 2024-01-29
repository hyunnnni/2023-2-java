package com.green.day84;

import java.io.File;
import java.util.stream.Stream;

//책의 EX2
public class StreamEx4 {
    public static void main(String[] args) {
        File[] fileArr = {
                new File("Ex1.java"),new File("Ex1.bak")
                ,new File("Ex2.java"),new File("Ex2.")
                ,new File("Ex2.java.txt")
        };
        Stream<File> fileStreamm  = Stream.of(fileArr);
        Stream<String> strStream = fileStreamm.map(item -> item.getName());
        strStream.forEach(System.out::println);

        Stream.of(fileArr).map(File::getName)
                            .filter(item -> item.indexOf("." ) != -1)//맘에 안드는 것을 거를 수 있는 메소드 그래서 개수가 줄어들 수 있다. 특정 문자열을 찾는다
                            .map(item -> item.substring(item.indexOf('.')+1))//문자열 자르기(인덱스) or (시작 인덱스, 끝 인덱스)
                            //비파괴라서 원본을 건들지 않는다
                            .distinct()
                            .map(item -> item.toUpperCase()); //대문자로 바뀐

        System.out.println("12345".indexOf('.'));//문자열에 내가 찾고자 하는 문자가 포함되는지 확인해주는 메소드
        System.out.println("123.45".indexOf('.'));
        System.out.println(".12345".indexOf('.'));
    }
}
