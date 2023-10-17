package com.green.day11.ch6;

import com.green.day10.ch6.NumberBox;

public class DiffPriRef {
    public static void main(String[] args) { //다른곳의 메소드를 쓰고 싶으면 객체 생성을 먼저 해주면 된다
        //static이 있다면 따로 안해도 되지만 static은 static 안의 거만 가져올 수 있다

        int num = 30;
        changeVal(num);
        System.out.println("num : " +num);
        //num값을 변경시키진 못한다 복사해서 가져간 후 저기서 프린트만 했을 뿐이니깐


       // -------------------------------------------------
        //오버로드 메소드 명이 같은 것 하지만 ()파라미터만 다르면 사용가능하다

        NumBox nb = new NumBox(); //1.NumBox 객체를 생성 NumBox에 접근
        System.out.println("(1)nb.num : "+nb.num); //2.NumBox의 num은 기본값 0이었다 생성하자마자 데려오면 기본값이 온다
        nb.num = 30; //3.그 객체의 num에 30을 대입할거다 바꿔버린다
        System.out.println("(2)nb.num : "+nb.num);//그래서 30으로 바뀐다
        changeVal(nb);//4.(nb)는 NumBox 주소값을 담고있다 이걸 타입이 같은 메소드 changeVal(NumBox nb2)가 받을 수 있다
        System.out.println("(3)nb.num : "+nb.num);// 8.같은 주소를 공유해 메소드를 이용해 원본을 바꿔버렸으니 num을 출력하게 되면 10으로 바뀌어있다


    }
    public static void changeVal (int num){
        num = 10;
        System.out.println("changeVal : "+ num);

    }
    public static void changeVal (NumBox nb2){ //5.같은 주소값을 가져왔기에 nb와 같은 곳으로 접근은 가능하지만
        // 다른 주소값으로 저장해서 바뀔 수 있다 nb와는 다른 존재로 이 메소드 안에서만 쓸 수 있는 주소값을 가진 타입이 생성된거다
        System.out.println("changeVal : NumBox");
        nb2.num = 10;//6.이때 nb와 같은 주소값을 가지고 있던 nb2가 그 주소에 접근해 num을 10을 바꿔버린다
        //같은 주소값을 가지고 있어서 원본을 건들 수 있어 영향이 간다
    }//7. 그리고 이 메소드가 끝나면서 임시로 만든 nb2는 없어진다
}

class NumBox {
    int num; //기본값 0이 들어있다
}