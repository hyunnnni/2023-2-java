package com.green.day13.ch6;

import com.green.day12.ch6.Card;

public class CardTest2 {
    public static void main(String[] args) {


        Card[] cards = makeCards(); //여기에 들어와야하는 타입은 card[]이다 그러니 리턴 메소드의 타입도 card[]이어야 한다
        //52개의 카드값을 가지고 있는 배열의 주소값을 리턴
        Card[] cards2 = makeCards();//같은 크기이지만 다른 존재 다른 주소값이 대입된다
        System.out.println(cards.length);

        Card[] cards3 = makeCards2();// 여기 메소드에서 객체 생성을 해서 그 주소값을 이 배열의 각방에 넣었기 때문에
        for(Card c : cards3){ //Card c는 Card객체의 주소값만 담을 수 있다
            c.printYourSelf(); // Card에 접근할 수 있었다
        }

    }
    public static Card[] makeCards(){//파라미터 안에 아무것도 없으면 아무것도 안 적어도 된다
        Card[] makeCards = new Card[52]; //card[]에는 card[]타입의 주소값만 넣을 수 있다.
        return makeCards;
    }

    public static Card[] makeCards2() { //선생님, 현민씨가 하신 거 이게 제일 낫다
        Card[] makeCards = new Card[52];
        String[] kinds = {"Spade", "Heart", "Diamond", "club"};
        int cnt = 0;
        for (int i = 0; i < kinds.length; i++) {

            for (int z = 1; z <= 13; z++) {
                String numder = getNumberFromInt(z);
                Card c = new Card(); //각 새로운 주소값마다 다 다른 값을 배열 방마다 넣는 것
                //원본에 값이 변하는게 아니라 새로운 객체를 생성했음으로 그 방마다 다 다른 복사된 card가 들어가는 것
                c.kind = kinds[i];
                c.number = numder;
                //makeCards[(i*13) + (z-1)] = c;
                makeCards[cnt++] = c;
            }
        }
        return makeCards;
    }

    public static String getNumberFromInt(int a){

        switch (a){
            case 0 :
                return  "k";
            case 1 :
                return "A";
            case 12 :
                return "Q";
            case 13 :
                return "k";
        }
        return String.valueOf(a);

    }



       /* public static Card[] makeCards2() { 내가 한 거


        Card[] makeCards = new Card[52];
        int total = makeCards.length / 13;
        int cardroom = makeCards.length / 4;
        int cnt = 0;
        for (int i = 0; i < total; i++) {
            for (int z = 1; z <= cardroom; z++) {
                Card c2 = new Card();
                if (i == 0) {
                    c2.kind = "Spade";
                } else if (i == 1) {
                    c2.kind = "Heart";
                } else if (i == 2) {
                    c2.kind = "Diamond";
                } else {
                    c2.kind = "Club";
                }
                if (z == 1) {
                    c2.number = "A";
                } else if (z == 11) {
                    c2.number = "J";
                } else if (z == 12) {
                    c2.number = "Q";
                } else if (z == 13){
                    c2.number = "K";
                }else {
                    c2.number = Integer.toString(z);
                } // 객체 생성을 한 번마다 안 하고 i문 돌 때만 했기에 마지막 이 부분이 그 주소값의 원본을 건드려서 숫자는 같은 값만 나온다
                //그래서 객체 생성은 이 z문 안으로 넣어야 한다
                makeCards[cnt++] = c2;
            }
        } return makeCards;
    }*/

}
