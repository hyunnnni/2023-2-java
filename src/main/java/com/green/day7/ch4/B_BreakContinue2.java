package com.green.day7.ch4;

public class B_BreakContinue2 {
    public static void main(String[] args){
        for (int i = 0; i<5; i++){

            for (int z = 10; z<15; z++){
                if(z == 13) { break;} //이 순간 그대로 멈춰버리고 반복문을 나와버린다
                System.out.printf("i : %d - z : %d\n", i, z);
            }
        }

        for (int i = 0; i<5; i++){

            for (int z = 10; z<15; z++){
                if(z == 13) { continue;}//이 순간만 아래 코드를 진행하지 않고 나머지 반복문을 마저 실행한다
                System.out.printf("i : %d - z : %d\n", i, z);
            }
        }
    }
}
