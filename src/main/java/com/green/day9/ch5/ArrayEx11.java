package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] arga) {
        final int LEN = 10;
        int[] numArr = new int[LEN];
        int[] cntArr = new int[LEN];

        //numArr 각 방에 0~9 사이의 랜덤값을 대입(중복가능)
        //numArr 각 방의 값 출력
        //cntArr의 0번 방은 0의 개수, 1번 방은 1의 개수 count값을 넣는다.
        //0~9의 개수를 출력

        for (int i = 0; i < LEN; i++) {
            numArr[i] = (int) (Math.random() * LEN);
        }
        System.out.println(Arrays.toString(numArr));

       /* for (int i = 0; i < LEN; i++) {
            cntArr[numArr[i]]++; //numArr에 들어있던 랜덤한 값이 cntArr의 []번째 방으로 표현됨으로 그 방의 수가 +1이 된다
            //그래서 배열 끝까지 다 확인을 하면 랜덤하게 들어갔던 수들의 개수를 다 알 수 있다
            //int val = numArr[i];
            // cntArr[val]++; 로 풀어쓸 수 있다
        }*/
        for(int num : numArr){
            cntArr[num]++; //향상된 for문을 사용하면 좀 더 간단하다 numArr이 num에 하나씩 차례대로 들어가기 때문에
            //예를 들어 num에 numArr[0]에 값 6이 들어가면 num은 6이 되면서 cntArr[num]에 [6]이 들어가면서 6번이 카운트 되는 형식
            //향상된 for문은 num에 배열의 값이 순차적으로 하나씩 들어왔다가 다시 그 다음 방 값으로 변환이 된다
            //계속 변하다는거임 초기화가 계속 된다고 그래서 이 for문 안에서 출력이든 뭐든 하지 않으면 변하는 건 없다
        }


        for (int i = 0; i < LEN; i++) {
            System.out.printf("%d의 개수 : %d\n", i, cntArr[i]);//출력은 따로 for문을 만들어서 해야한다
            //같이 넣을 시 배열이 끝까지 돌지않고 하나씩 채워질 때마다 @의 자리 개수가 체크가 되기 때문에 정확하지 않다


        }
    }
}
