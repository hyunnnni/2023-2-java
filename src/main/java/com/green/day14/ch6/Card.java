package com.green.day14.ch6;

public class Card {
    String pattern; //전역변수 객체가 살아있는 동안 계속
    String denomination;

    public Card (String pattern, String denomination){//지역변수 호출이 끝나면 사라짐 살아있는 범위가 다름 (스코프)
        this.pattern = pattern;//그래서 받아오는 값의 변수명과 전역변수의 이름이 같으면 단순히 안들어간다
        this.denomination = denomination;//this.을 꼭 붙여줘야한다
    } //오른쪽 키 - Generate - constructor 을 누르면 이런 생성자를 자동으로 적어준다



    void printMySelf(){
        System.out.printf("%s (%s)\n",pattern, denomination);
    }



}

class CardTest{
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        //cd.printAll2();

        //Card c1 = cd.getCard2(); 이걸 주석처리 안하면 여기서 한 칸 빼갔기 때문에 메소드에서 while문이 계속 null이라
        //무한루프로 돈다

        for(int i=0; i<52; i++){
            System.out.println(i);
            Card c = cd.getCard();
            c.printMySelf();
        }

    }


}
