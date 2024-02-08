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

        Stream.of(fileArr).map(File::getName)//map을 쓰는 이유 형을 바꾸려고 사용하는데 1:1 비율로 똑같은 사이즈로 만들어주는 메소드
                            .filter(item -> item.indexOf("." ) != -1)//맘에 안드는 것을 거를 수 있는 메소드 그래서 개수가 줄어들 수 있다. 특정 문자열을 찾는다
                            .map(item -> item.substring(item.indexOf('.')+1))//문자열 자르기(인덱스) or (시작 인덱스, 끝 인덱스)
                            //비파괴라서 원본을 건들지 않는다
                            .distinct()
                            .map(item -> item.toUpperCase());
        //stream 물레방아처럼 한땀한땀 처리? 일회용임 데이터를 흐르게 함 마무리가 되면 리소스가 해제되어 또 쓰고 싶다면 또 적어주어야 한다.리스트만 가능
        //map 앞 리스트와 사이즈가 똑같은 리스트를 만들어 리턴해준다 근데 타입도 대입연사자에 맞춰 변경해줌 값이 들어오면 리턴을 꼭 해주어야 함
        // filter라는 메소드도 있는데 사이즈가 달라질 수 있음
        //배열은 어렵긔 리스트로 변환 후 stream으로 만들 수 있음
        //크기는 갖고 내용물을 조금 다르게 바꾸고싶을 때 쓰는 메소드
        //collect : Stream<String> 상태였는데 콜렉션으로 List<String>으로 변화됨


        System.out.println("12345".indexOf('.'));//문자열에 내가 찾고자 하는 문자가 포함되는지 확인해주는 메소드
        System.out.println("123.45".indexOf('.'));
        System.out.println(".12345".indexOf('.'));
    }
}
