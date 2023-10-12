package com.green.day11.ch6;

public class StarPrintTest {
    public static void main(String[] args){
        StarPrint sp = new StarPrint();

        sp.line(5);
        sp.line(7);

        sp.square(4);

        sp.triangle(5);

        String gender = sp.chkGenderById("011231-1117111");
        System.out.println(gender);
        /*8번째 자리의 숫자가
        2,4이면 여자
        1.3면 남자
        이외는 유효하지않은 주민번호
         */

        int sum = sp.sumFromTo(4,10);
        int sum2 = sp.sumFromTo(10,15);
        System.out.println("sum : "+ sum +"\nsum2 : "+ sum2);

        //n1~n2까지 하나씩 더하라
    }
}
