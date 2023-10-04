package com.green.day4.ch4;

public class A_Abs {
    public static void main (String[] args) {
        int num = -15;

        /*if (num < 0) {
            System.out.printf( "%d 는(은) 절대값 %d\n",num, -num );
        } else {
            System.out.printf("%d 는(은) 절대값 %d\n", num, num);
        }*/

        // 줄였을 때 : System.out.printf("%d 는(은) 절대값 %d" , num , num < 0 ? -num : num );
        //바로 계산

        /*int result = num < 0 ? -num : num ;
        System.out.printf("%d 는(은) 절대값 %d" , num , result );
        연산의 값을 담고 출력*/

        System.out.printf("%d는(은) 절대값 %d\n", num, Math.abs(num));
        //
    }

}
