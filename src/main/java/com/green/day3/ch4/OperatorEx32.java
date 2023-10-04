package com.green.day3.ch4;

public class OperatorEx32 {
    public static void main (String[] args){
        //조건식 ? true 였을 때 : false였을 때 보통 두 가지 정도 있을 때 사용
        //조합하면 사용해도 괜찮으나 FlowEx4처럼 많을 땐 ifelseif로 사용하는게 나음
        int n1 = 10, n2 = 20;

        int r = n1 > n2 ? n1 : n2; // 앞에 식이 true 였다면 n1이 r에 복사되어서 값에 들어가게 됨
        // false 였다면 뒤에 n2가 복사

        System.out.println("r : " + r );
    }
}
