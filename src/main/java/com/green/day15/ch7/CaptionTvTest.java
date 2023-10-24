package com.green.day15.ch7;

class Tv{
    boolean power;
    int channel;
    void power() {power =!power;}//실행할 때마다 값이 바뀐다 : 토글 (스위치라고 생각하면 쉽다)
    void channelUp(){ channel++; }
    void channelDown(){ channel--; }


}
class CaptionTv extends Tv{
    boolean caption;
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }


    @Override //이걸 적고 오버라이딩 메소드를 적었을 때 빨간 줄이 뜨면 오버라이딩이 아니라는 뜻 그래서 사용할 때 같이 적어놓으면 확인하기 쉽다잉~
    //애노테이션이라고 함 Annotaion
    void channelUp(){//오버라이딩 부모클래스의 것을 가져오기 않고 자기가 새롭게 만든 걸 쓰는 것
        //구현부 내용을 원하는대로 새롭게
        //부모가 가진 메소드랑 이름이 같아야함 이름이 다르면 그냥 메소드를 추가한 것임
        channel += 2;
    }
}
public class CaptionTvTest{
    public static void main(String[] args) {

        CaptionTv cTv = new CaptionTv();
        System.out.printf("cTv.power : %b\n", cTv.power); //false
        cTv.power();
        System.out.printf("cTv.power : %b\n", cTv.power);//true
        cTv.power();
        System.out.printf("cTv.power : %b\n", cTv.power);//false
        cTv.channel = 10;//captionTv에 접근해서 찾아보니 없다. 그래서 상속해준 부모에게 가서 찾아와 사용
        cTv.channelUp();
        System.out.printf("cTv.channel : %d\n", cTv.channel);
        cTv.displayCaption("반갑다 친구들!!"); //caption이 기본값 false이기 때문에 if문에서 그냥 통과~
        cTv.caption = true;
        cTv.displayCaption("아아아");
    }
}
