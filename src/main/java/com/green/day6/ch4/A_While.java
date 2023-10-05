package com.green.day6.ch4;

public class A_While {
    public static void main(String[] args){//p.167
        //while은 반복문입니다
        //for문과 비슷하다 선언은 밖에서 증가식은 {}안에서 해주면 된다
        //fot문은 얼만큼 돌지 알 때 사용하고 while문은 멈춰야 하는 수의 조건만을 알고 있을 때 사용
        //++이 없는 경우의 수를 받을 때 주로 사용
        //일정 숫자에서만 멈추길 원하고 그 외엔 계속 반복되길 원할 때 사용한다

        int i =0;
        while(i<10){
            System.out.println("while- " + i);
            i++;

            //System.out.println("while- " + i++); 이렇게도 가능 ++i는 증가가 된 후 출력이 되므로 0부터 시작이 아닌
            //1이 시작이 되길 원하면 ++i로 써도 무방하다
            //()안의 내용이 충족될 때까지 끝나지 않고 반복됨
        }
    }
}
