package com.green.day15.ch7;

public class CaptionTvTest2 {
    public static void main(String[] args) {
       CaptionTv2 ctv = new CaptionTv2();//객체 생성 하나로 상속한 부모 객체까지 생성됨(오브젝트까지)
       ctv.channel = 10;//captionTv2의 channel이 10으로 된다
        ctv.getParentChannel();
       ctv.channelUp();// captionTv2에는 이 메소드가 없어서 그 부모인 Tv2에 가서 메소드를 호출하고 채널업을 한다. 이때 불러온 속성은 같은 클래스인
        //Tv2의 채널을 ++한것이다. 한 번 올라가면 자식클래스로 내려가진 않기 때문
        System.out.printf("ctv.channel:%d\n", ctv.channel);
        ctv.printParentChannel();

    }
}

class Tv2{
    boolean power;
    int channel;
    void power() {power =!power;}//실행할 때마다 값이 바뀐다
    void channelUp(){ channel++; }
    void channelDown(){ channel--; }

}
class CaptionTv2 extends Tv2 {
    int channel;
    boolean caption;
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
    void printParentChannel(){
        System.out.printf("parent - channel : %d\n", super.channel); //그냥 channel만 적으면 가장 가까운 channel =10을 데려온다
        //this를 적으면 이 해당 클래스 안의 channel을 데려온다.
        //super를 적으면 부모 클래스 안의 channel을 데려온다
    }

    void getParentChannel(){
        System.out.printf("ctv.channel : %d\n", super.channel);
    }
}
