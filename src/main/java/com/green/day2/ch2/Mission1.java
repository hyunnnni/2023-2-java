package com.green.day2.Ch2;

import java.sql.SQLOutput;

public class Mission1 {
    public static void main(String[] args) {
        int n1 =10, n2 =3;

        System.out.println(n1 / n2);
        System.out.println((double) n1 / n2);

        //실수 타입으로 변수선언을 한 후 대입을 int에서 double로 강제 형변환 후 대입
        //n1 앞에만 붙인 이유는 더블이 더 강하기 때문에 하나만 형변환을 해도 뒤에 자동형변환이 되면서 실수로 연산이 됨

        double r = ((double)n1 / n2);

        System.out.println(r);


    }
}
