package com.green.day15.ch7;

public class DeckTest2 {
    public static void main(String[] args) {
        Deck2 deck = new Deck2();

        /*for(Card2 c: deck.cardArr){
           c.print();
        }*/

        Card2 c1 = deck.pick(50);
        System.out.printf("pick  kind : %d, number : %d\n",c1.kind ,c1.number);
        System.out.println(c1);
        System.out.println("-------");
        Card2 c2 = deck.pick();
        System.out.println(c2);

    }
}

class Deck2{
    final int CARD_NUM = 52;
    Card2[] cardArr = new Card2[CARD_NUM];


   /* public Deck2(){ 내가 한 거
        Card2 c1 = new Card2();
        int[] pat = {c1.CLOVER,c1.HEART,c1.DIAMOND,c1.SPADE};
        int cnt = 0;
        for(int i = 0; i<c1.KIND_MAX; i++) {
            for (int z = 1; z <= c1.NUM_MAX; z++) {
                Card2 c2 = new Card2();
                c2.kind = pat[i];
                c2.number = z;

                cardArr[cnt++] = c2;
            }
        }
    }*/
    //선생님이 한 거
    public Deck2( ){
        Card2 c1 = new Card2();
        int cnt = 0;
        for (int i = 1; i<=c1.KIND_MAX; i++){
            for(int z = 1; z<=c1.NUM_MAX; z++){
                cardArr[cnt++] = new Card2(i,z);// 객체 생성이 된거니 이 타입을 받을 수 있는 생성자를 만들어야한다
            }
        }
        for(Card2 c: cardArr){ //c의 주소값을 프린트한다 근데 c는 주소값 이거의 값을 출력하면 오브젝트에 있는 toString이 그냥 위치를 문자열로
            //리턴해서 찍어버린다 c 뒤에 .toString이 생략되어있음
            //그럼 그 안에 값을 알려면 오브젝트의 toString이란 메소드를 오버라이딩 해줘야한다
            System.out.println(c);
        }
    }

    public Card2 pick(int arr1){ // 배열의 각 방에 있는 값을 가져올 수 있는 리턴 메소드
        return cardArr[arr1];
    }

    public Card2 pick (){
        int a = (int)(Math.random()*CARD_NUM);
        //return cardArr[a]; 이렇게 적어도 되고 만든 메소드를 이용해도 좋다
        return pick(a);
    }
}

class Card2{
    static final int KIND_MAX = 4;//카드무늬 수
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    public void print (){
        System.out.printf("kind : %d, number : %d\n", kind, number);
    }

    public Card2(){

    }
    public Card2(int i, int z){
        kind = i;
        number = z;
    }

    public String toString(){
        return String.format("kind : %d, number : %d", kind, number);
    }

}
