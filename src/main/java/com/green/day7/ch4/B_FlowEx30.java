package com.green.day7.ch4;

public class B_FlowEx30 {
    public static void main(String[] args){
        //반복문 사용
        //i값이 계속 증가가 되면서 sum에 중첩으로 더하기
        //sum 값이 100초과가 되는 시점의 i값을 구하라
        int sum = 0;
        int i = 0;

     /*   for(i = 0; sum < 100; i++){
            sum = sum+i;
        }
        System.out.println("sum : " + sum);
        System.out.println("i : "+ i);*/

        final int TARGET = 100; //매직넘버 원하는 수를 변수선언해서 따로 설정하면 나중에 바꾸기 쉽고 while을 무한으로 써서 짜는게 수를 바꿔도 값을 구할 수 있다
        while(true){
            sum += ++i; // ++을 뒤에 붙이면 sum값이 105가 초과가 된 후 i가 15로 변하고 break를 만나기 때문에 i의 값이 변형이 된다
            if(sum > TARGET){break;}
        }
        System.out.println("sum : "+ sum);
        System.out.println("i: "+ i);

    }
}
