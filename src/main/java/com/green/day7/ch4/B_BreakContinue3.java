package com.green.day7.ch4;

public class B_BreakContinue3 {
    public static void main(String[] args){//p.178
        abc:// 반복문에 이름을 붙임
        for (int i = 0; i<5; i++){

            for (int z = 10; z<15; z++){
                if(z == 13) { break abc;} //원하는 조건의 뒤에 붙인 break뒤에 반복문의 이름을 적으면 반복문 그 자체를 다 나올 수 있다
                System.out.printf("i : %d - z : %d\n", i, z);
            }
        }
        def:// 반복문에 이름을 붙임
        for (int i = 0; i<5; i++){

            for (int z = 10; z<15; z++){
                if(z == 13) { continue def;} //원하는 조건의 뒤에 붙인 continue 뒤에 반복문의 이름을 적으면 해당 반복문의 뒤 코드를 더 이상 수행하지 않고 빠져나온다 그냥 break 쓰는 것과 같음
                System.out.printf("i : %d - z : %d\n", i, z);
            }
        }
    }
}
