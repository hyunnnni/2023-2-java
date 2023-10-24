package com.green.day18.ch7;



import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) { //key와 val로 이루어진 컬렉션
        Map map = new HashMap();
        //순서가 상관이 없다
        //순서가 없기 때문에 향상된 for문은 사용이 안된다
        map.put("a",10);
        //"물건이름", val으로 값을 넣는다
        map.put("b",20);

        Object obj = map.get("b");
        //이름만 알아도 값을 알 수 있다
        int val = (int)obj;
        //값이 들어갈 때 object로 변형되어 값이 들어갔다 그래서 나올 때도 object로 나오기 때문에 형변환이 필요하고
        //넣을 때도 막 아무런 타입으로 다 넣어질 수 있어서 만약 사용할거라면 아래 class처럼 타입을 설정하고 넣어줘야한다
        System.out.println("val : " + val);

    }
}

class HashMapTest2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        //보통 String으로 많이 정한다 뒤는 정수, 실수 뭐 아무거나
        map.put("Tv",0);
        map.put("Computer",0);
        map.put("Audio",0);

        map.put("Audio",map.get("Tv")+1);
        map.put("Audio",map.get("Tv")+1);// 이 문장이 늘어날 때마다 값이 +된다

        System.out.println("Tv Count : "+ map.get("Tv"));
    }
}

