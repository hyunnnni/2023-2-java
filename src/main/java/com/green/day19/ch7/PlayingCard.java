package com.green.day19.ch7;

public interface PlayingCard {
    public static final int SPADE = 4;//interface는 멤버필드 앞에 public static final가 다 붙여져있다
    final int DIAMOND = 3;//여기도 자동으로 다 public static final이 앞에 있다
    static int HEART = 2;
    int CLOVER = 1;//그래서 멤버필드는 잘 안 적음


    public abstract String getCardNumber();//메소드 앞에는 public abstract가 기본으로 다 있다
    String getCardkind();
    //그래서 interface도 추상클래스처럼 부모역할만 하려고 쓰는 것
    //그리고 interface는 상속할 때 implements를 쓴다
}

interface PlayingChess extends PlayingCard{//같은 입장이라 구현부를 생성할 수 없으니 오버라이딩을 할 수 없다
    //그러니 상속 받아도 강제성이 없다
    //interface는 interface를 상속 받을 수 있다 이럴 경우에만 extends를 쓴다
    void moveHorse(int x, int y);
}

class Chess implements PlayingChess{

    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardkind() {
        return null;
    }

    @Override
    public void moveHorse(int x, int y) {

    }
}



class Card implements PlayingCard{
    @Override
    public String getCardNumber(){
        return null;
    }
    @Override
    public String getCardkind(){
        return null;
    }
}

class PlayingCardTest{
    public static void main(String[] args) {
        System.out.println(PlayingCard.CLOVER);
    }
}
