package com.green.day3.ch4;

public class AssignmentOperators {
    public static void main(String[] args){
        //복합 대입 연산자 p.132
        int n1, n2, n3;
        n3 = 10;
        n1 = n2 = n3; // n3에서 읽고 n2 대입, n2에서 읽고 n1 대입
        System.out.printf("n1 : %d, n2 : %d, n3 : %d\n" , n1 ,n2, n3);

        n1 = n1 + 4;
        System.out.printf("n1 : %d, n2 : %d, n3 : %d\n" , n1 ,n2, n3);

        n2 += 4;
        System.out.printf("n1 : %d, n2 : %d, n3 : %d\n" , n1 ,n2, n3);
        // 위와 같다 n2를 두 번 적기 번거로우니 이런식으로 사용 _+*% 다 가능


        n3++; //+1이 됨
        ++n3;
        System.out.printf("n1 : %d, n2 : %d, n3 : %d\n" , n1 ,n2, n3);

        n2--;
        --n2;//= 없이 값이 변경되는 건 이 두 가지 밖에 없다
        System.out.printf("n1 : %d, n2 : %d, n3 : %d\n" , n1 ,n2, n3);
    }
}
