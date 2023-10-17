package com.green.day14.ch6;

public class CardDeck {
    Card[] cards; //배열을 생성자 안에 넣으면 지역변수가 되기 때문에 끝나면 죽어버린다 그래서 밖에 만들어준다

    public CardDeck() {
        cards = new Card[52];
        String[] patterns = {"Spade", "Heart", "Diamond", "club"}; // 여러개의 값을 담은 것을 컬렉션이라고 함
        //그 종류 중 하나가 배열
        int cnt = 0;
        for (int i = 0; i < patterns.length; i++) {
            String pattern = patterns[i];
            for (int z = 1; z <= 13; z++) {
                String denomination = getNumberFromInt(z);
                Card c = new Card(pattern, denomination);//멤버필드의 값에 각 위에서 string타입에 넣어준 값을
                //객체 생성을 새로 하나씩 하면서 넣는다
                cards[cnt++] = c;
                //cards[cnt++] = new Card(pattern, denomination); 줄여서 쓰기
            }
        }
    }

    private String getNumberFromInt(int a) { //같은 클래스 안에서만 사용가능

        switch (a) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "k";
        }
        return String.valueOf(a);

    }


    void printAll() {
        for (Card c : cards) { //c에는 cards란 배열의 각 방에 있는 각각의 주소값이 들어간다.
            c.printMySelf();//그래서 출력해야 하는 내용을 가지는 주소값의 클래스에 접근해 그 곳에 같이 복사되어 들어갔던 print메소드를 호출해서 사용
        }
    }

    void printAll2(){
        for(int i = 0; i<cards.length; i++){
            System.out.println(cards[i].pattern + "("+cards[i].denomination+")");
        }
    }

    public Card getCard(){
        Card c2 = null;
        for(int i =0; i<cards.length; i++) {
            int idx = (int) (Math.random()*cards.length);
            c2 = cards[idx];
            for(int z = 0; z<i; z++){
                if(c2 == null){
                    i--;
                }
            }
            cards[idx] = null;
            break;
        }
        return c2;
    }

    public Card getCard2() {
        Card c = null;
        while(true){
            int rIdx = (int)(Math.random()*cards.length); //0번방부터 나오기 때문에 cards의 길이만큼 랜덤돌리면 된다
            c = cards[rIdx];
            if(c != null){
                cards[rIdx] = null;
                break;
            }
        }
        return c;
    }
}
