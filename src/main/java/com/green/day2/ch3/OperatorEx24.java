package com.green.day2.Ch3;

public class OperatorEx24 {
    public static void main(String[] args) {
        boolean b1 = 1 == 1 && 2 == 2; //&&는 and 연산자
        //and 연산자는 위의 내용이 전부 true이어야 true가 나온다
        System.out.println("b1 : " + b1);

        boolean b2 = 1 == 1 && 2 == 2 && 3 == 4;
        System.out.println("b2 : " + b2);
        //false가 있으면 안된다 그럼 모든 게 다 false

        System.out.println("---------------------");

        boolean b3 = 1 == 2 || 2 == 3 || 4 == 4; // ||는 or연산자
        System.out.println("b3 : " + b3);

        boolean b4 = 1 == 2 || 2 == 3 || 4 == 5; // or은 모든 게 false여야 false가 나온다 앞에서 순차적으로
        //계산하기 때문에 false가 나올 가능성이 높은 거 부터 앞으로 배치
        System.out.println("b4 : " + b4);

        System.out.println("-----------------------------");

        boolean b5 = 1 == 1;
        System.out.println("b5 : " + b5);
        System.out.println("!b5 : " + !b5); //!는 not 반대라는 뜻
        System.out.println("!!b5 : " + !!b5);//!!는 반대의 반대라는 뜻
    }
}
