package com.green.day15.ch7;

public class DeckTest {
    public static void main(String[] args) {
        Card c = new Card();
        System.out.printf("c.kind : %d,number : %d\n", c.kind, c.number );// 4, 1

        Card c2 = new Card(Card.HEART,3);
        System.out.printf("c2.kind : %d,c2.number : %d\n", c2.kind, c2.number );

        System.out.println(c2.toString());//toString의 타입은 String 마우스를 올려보면 이 메소드의 선언부를 알 수 있다. 리턴타입 메소드
        System.out.println(c2);

        String str = new String("ddd"); //여기서 오버라이딩이 진행됨
        System.out.println(str);
        System.out.println(str.toString()); //toString이 String으로 오버라이딩 되었다
    }
}

class Deck{
    final int CARD_NUM = 52;
    Card[] cardArr = new Card[CARD_NUM];
}

class Card{//상수는 한 번 입력된 값이 변하지 않는 것 리터럴은 값 그 자체를 리터럴이라고 한다.
    static final int KIND_MAX = 4;//카드무늬 수
    static final int NUM_MAX = 13;//무늬별 카드 수
    //객체화가 필요없기 때문에 다른 클래스에서 사용할 땐 객체 생성을 하지않고 그냥 Card.KIND_MAX라고 적어도 쓸 수 있다.

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    public Card (){
     this(SPADE,1);

    }

    public Card(int kind, int number){
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString(){
        return String.format("kind : %s, number : %s", kind, number);
        //return "kind : " + kind +" number : "+number; 이렇게 쓰면 + 뒤가 문자열로 자동으로 바꿔주면서 전체가 문자열로 바뀔 수 있고
        //그 값을 보낼 수 있게 된다. 이 리턴 메소드는 문자열만 보낼 수 있으니
    }

}
