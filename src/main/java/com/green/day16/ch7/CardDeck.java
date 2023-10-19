package com.green.day16.ch7;


public class CardDeck {//배열안의 주소값들을 랜덤하게 위치를 섞어준다.
    public static void main(String[] args) {
        Deck3 deck = new Deck3();

        deck.ranCard();

    }
}

class Deck3 {
    final int CARD_NUM = 52;
    Card3[] cardArr = new Card3[CARD_NUM];

    public Deck3( ){
        Card3 c1 = new Card3();
        int cnt = 0;
        for (int i = 1; i<=c1.KIND_MAX; i++){
            for(int z = 1; z<=c1.NUM_MAX; z++){
                cardArr[cnt++] = new Card3(i,z);
            }
        }
        for(Card3 c: cardArr){
            System.out.println(c);
        }
    }
    public void ranCard(){
        Card3 tmp; //cardArr은 Card3의 주소값을 넣어놓은 배열이기때문에 각방에은 Card3의 주소값이 들어있다.
        //그래서 그 주소값을 담을 수 있는 타입의 빈공간이 필요하다 레퍼런스 선언 시 기본값은 null이 있다.

        for(int i = 0; i<cardArr.length; i++){
            int ran = (int)(Math.random()*CARD_NUM);
            tmp = cardArr[ran];
            cardArr[ran] = cardArr[i];
            cardArr[i]= tmp;
        }
        for(Card3 c: cardArr){
            System.out.println(c);
        }
        /*for(int i = 0; i<cardArr.length; i++){
            System.out.println(cardArr[i]);
        } 이렇게 적어도 된다 */

    }

}

class Card3{
    static final int KIND_MAX = 4;//카드무늬 수
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    public Card3(){

    }
    public Card3(int i, int z){
        kind = i;
        number = z;
    }


    public void print (){
        System.out.printf("kind : %d, number : %d\n", kind, number);
    }
    public String toString(){
        return String.format("kind : %d, number : %d", kind, number);
    }


}
