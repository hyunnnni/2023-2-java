package com.green.day18.ch7;

import java.util.*; //util이란 곳에 list 랑 ArrayList가 있나봐,,,, 거기서 import했다!

public class ArrayListTest {//컬렉션
    public static void main(String[] args) {
        List list =new ArrayList();//타입이 다른데 대입이 되니깐 상속관계라는 걸 알 수 있다

        list.add(10);
        list.add(10.3f);
        list.add(10.4d);
        list.add(10l);
        list.add("dddd");
        list.add(new ArrayList());
        //모든 타입이 다 들어간다. list에 오브젝트 타입으로 추가한 것이다 add라는 메소드 이용
        //리턴타입도 된다 boolean이다
        //넣은 만큼 배열의 길이가 정해진다
        Object val1 = list.get(0);
        int intVal =(int)val1;
        //그래서 값을 뺄 때도 오브젝트에 담고 형변환을 해줘야한다. 이럴 때 몇 번방에 어떤 타입을 들어가 있는지를 알아야 한다.
        //값을 빼는 건 get이란 메소드를 이용
        //형변환을 계속 해야 해서 번거롭다

        Object obj = 10;
        obj = 10.3f;
        obj = 10.3d;
        obj = 103l;
        obj = "ddd";
        obj = new ArrayList();//모든 타입이 다 들어간다. 하지만 쓸 데 타입을 알 수 없기 때문에 타입 체크를 하고 사용해야 함

    }
}

class ArrayListTest2{
    public static void main(String[] args) {//list의 넣을 타입을 정할 수 있다
        int v1 = 10;
        Integer v2 = 10;
        System.out.println(v1 == v2);
        //Integer을 이런 식으로 사용할 수 있다 기본형의 래퍼클래스
        //레퍼런스라서 메소드도 가질 수 있다 숫자가 저장될 때 Integer로 변환되어서 저장이 되는 것이다.
        //기본형 8개는 다 래퍼클래스가 있다
        List<Integer> list = new ArrayList();
        //List<래퍼 타입만 넣을 수 있다>
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(45);
        //list.add(10.3f);이게 안된다
        int val1 = list.get(0);
        //아까는 꺼낼 때 Object타입으로만 값을 나왔는데 이렇게 타입을 정하면 값이 나올 때도 원하는 타입으로 나온다

        System.out.println(list.size());//배열의 길이를 알 수 있었던 .length랑 같은 역할
        System.out.println("------------------------------------");

        for(int i = 0; i<list.size(); i++){
            System.out.printf("list[%d] : %d\n", i, list.get(i));
        }
        for(int val : list){
            System.out.println(val);
        }
        //컬렉션이니깐 향상된 for문도 가능


    }
}

class ArrayListTest3{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);//주소값을 했는데 Arrays.toString()한 것처럼 나오는 이유는
        //list에 toString을 오버라이딩한 게 있기 때문!

        list.add(1, 100);
        //1번방에 100을 넣어주는 새치기 기능
        System.out.println(list);

        list.remove(0);
        //0번방에 있는 값을 지워준다
        System.out.println(list);
    }
}