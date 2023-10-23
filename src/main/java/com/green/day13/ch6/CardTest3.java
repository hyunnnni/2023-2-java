package com.green.day13.ch6;
class Card{
    String pattern;
    String denomination;

    void printYourSelf (){
        System.out.printf("%s - %s\n", pattern, denomination);
    }


}
public class CardTest3 {

    public static void main(String[] args) {

        Card[] cards = makeCards(); //앞에 .이 생략 됐기 때문에 static 메소드임 String.valueOf() 이런 종류도 static메소드이다

        System.out.println(makeCards().length);

        for(Card c1 : cards) {
            c1.printYourSelf();
        }
    }

    public static Card[] makeCards(){//태형씨가 한 것
        Card[] arr = new Card[52];
        String []  patterns = {"Spade", "Heart", "Diamond", "club"};
        for(int i = 0; i< arr.length; i++) {
            String pattern = patterns[i/13];
            String denomination = getNumberFromInt ((i+1) % 13);
            arr[i] =new Card();
            arr[i].pattern = pattern;// [i]에 새로운 주소값이 들어가면서 그 주소값의 패턴과 디노미네이션에 접근해 값을 바꾸는거다
            arr[i].denomination = denomination;
            /*Card c = new Card();
            c.pattern = pattern;
            c.denomination = denomination; 이건 그 안에 값을 먼저 정의하고 그 주소값을 [i]방에 넣어주는거다
            arr[i] = c;
            위 3줄과 같은 내용 */
        }
        return arr;

    }

    public static String getNumberFromInt(int a){

        switch (a){
            case 0 :
                return  "k";
            case 1 :
                return "A";
            case 11 :
                return "J";
            case 12 :
                return "Q";
        }
        return String.valueOf(a);

    }
}
