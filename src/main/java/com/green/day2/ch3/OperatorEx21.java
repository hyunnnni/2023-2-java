package com.green.day2.Ch3;

public class OperatorEx21 {
    public static void main(String[] args){
        int n1 = 10, n2 =10, n3 = 11, n4 = 9;
        System.out.printf("%d < %d : %b\n", n1, n1, n1 < n2);
        System.out.printf("%d < %d : %b\n", n1, n3, n1 < n3);//초과
        System.out.printf("%d <= %d : %b\n", n1, n2, n1 <= n2);//이상
        System.out.println("--------------------");
        //= 이 있게 되면 같은 수가 나와도 true
        System.out.printf("%d > %d : %b\n", n1, n2, n1 > n2);//미만
        System.out.printf("%d > %d : %b\n", n1, n4, n1 > n4);
        System.out.printf("%d >= %d : %b\n", n1, n2, n1 >= n2);//이하
        System.out.println("--------------------------------");

        System.out.printf("%d == %d : %b\n", n1, n2, n1 == n2); // 같은가를 묻는 ==
        System.out.printf("%d != %d : %b\n", n1, n2, n1 == n2); // 다른가를 묻는 =!
        System.out.printf("%d != %d : %b\n", n1, n3, n1 == n3);
    }
}
