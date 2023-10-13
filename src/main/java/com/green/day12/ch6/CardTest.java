package com.green.day12.ch6;

public class CardTest {
    public static void main(String[] args){
        Card cd1 = new Card();
        cd1.kind = "Spade";
        cd1.number ="A";

        Card cd2 = new Card();
        cd2.kind = "Heart";
        cd2.number ="10";

        System.out.println(cd1 == cd2);//같지않다
        cd1 = cd2; //cd2의 주소값이 cd1에 복사되었기 때문에 cd1의 주소값은 cd2와 같아졌다 그래서 둘 다 같은 곳을 향한다
        //셸로우 카피
        System.out.println(cd1 == cd2);//같다
        System.out.println("c1,kind : "+cd1.kind);
        System.out.println("c1,kind : "+cd2.kind);
        /* A:1 j:11 Q:12 k:13
        문자열은 정수형으로
         */
        System.out.println(cd1.getScore());//1 원래는 1 나오는데 위에 셸로우카피를 해서 같은 주소값임
        System.out.println(cd2.getScore());//10




    }
}
