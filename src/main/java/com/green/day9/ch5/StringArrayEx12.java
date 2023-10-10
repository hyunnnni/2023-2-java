package com.green.day9.ch5;

import java.util.Arrays;

public class StringArrayEx12 {
    public static void main(String[] args){
        String[] names = {"Kim", "Park", "Yi"};
        //string에는 문자만 가능

        for(int i = 0; i<names.length; i++){
            System.out.printf("names[%d] : %s\n", i, names[i]);
        }

        names[1] = "Woo";//정수에서 했던 것과 동일하게 바꿀때는 이렇게 사용

        System.out.println(Arrays.toString(names));

        int z = 0;
        for(String str : names){//foreach문 (향상된 for문) 배열이면 사용할 수 있다
            //인덱스가 있는 배열들은 향상된 for문을 쓸 수 있다
            //String str에 names의 0번째 방에 있던 문자열부터 차례대로 넣어준다
            //그래서 str만 출력했을 때 넣은 문자열이 모두 출력된다
            System.out.println(str);
            //대신 인덱스를 사용 못함
            System.out.printf("names [%d] : %s\n", z++,str);
            //쓸려면 변수선언하고 이렇게 적어야 인덱스를 사용한 거 처럼 보일 수 있다
        }
    }
}
