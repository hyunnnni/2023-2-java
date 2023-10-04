package com.green.day4.ch4;

public class D_Switch {
    public static void main(String[] args){
        //p.147
        //switch는 비교만 가능 ==만 가능 equals포함
        int val = 2;

        switch (val) { //괄호 안에서 사칙연산 가능
            case 1 : //'1'은 값. 여기서 같은 수는 올 수가 없다
                System.out.println("1이다");
                break;
            case 2 :
                System.out.println("2이다");
                break;
            case 3 :
                System.out.println("3이다");
                break;
            default ://else와 같은 역할, 보통은 제일 밑에 꼭 제일 밑에 있어야 하는 건 아니다
                System.out.println("1~3이 아니다");
                break;//마지막 break는 생략가능
        }
        //break가 없다면 해당되는 곳에서 실행이 된 후 break를 만날 때 까지 해당하지 않더라도 계속 실행이 되며 내려간다
    }
}
