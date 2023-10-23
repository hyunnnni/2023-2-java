package com.green.day17.ch7;

public class PolyArgumentTestVer2 {//객체 생성 시 아래의 아규먼트 ()를 받아서 멤버필드를 변경할 수 있는 생성자를 만들어라
    public static void main(String[] args) {
        Product2 p = new Product2("제품명", 1000);
        System.out.println(p);
    }
}

class PolyArgumentTestVer2_2{//객체 생성 시 멤버필드에 원하는 값으로 변경하고 출력했을 때 아래처럼 나오게 해라
    public static void main(String[] args) {
        Tv2 tv = new Tv2();
        System.out.println(tv);//name : Tv, price : 100, bonusPoint : 10

        Computer2 com = new Computer2();
        System.out.println(com);//Computer, 200, 20

        Audio2 audio= new Audio2();
        System.out.println(audio);//Audio, 500, 50
    }
}
class PolyArgumentTestVer2_3{//배열의 각방에 순차적으로 구매한 이력이 들어가게 한다
    public static void main(String[] args) {
        Buyer2 buyer = new Buyer2();
        buyer.buy(new Tv2());//0번방에 들어감
        buyer.buy(new Computer2());//1
        buyer.buy(new Audio2());//2
        buyer.buy(new Audio2());//3 금액부족이 뜬다

        /*for(int i = 0; i<buyer.product2Arr.length; i++){
            Product2 p = buyer.product2Arr[i];
            System.out.printf("arr[%d] : %s\n", i, p);
            //각 배열 방에 잘 들어갔는지 체크하는 for문
        }product2Arr이 private으로 감춰지기 전에 가능했던 코드*/

        buyer.summary3(); //총 구매 금액 : 1000만원

    }
}

class Buyer2 {
    //money(정수) 저장가능
    //bonusPoint(정수) 저장 가능
    //Product 객체의 주소값 여러개 저장 가능

    int money;
    int bonusPoint;
    private Product2[] product2Arr;
    int cun = 0;
    final int IMONEY;
    //구매한 각 제품의 개수를 구하는 방법도 있음 선생님 깃허브보기

    int sum2 = 0;
    public Buyer2() {
        this.money = 1000;
        this.bonusPoint = 0;
        product2Arr = new Product2[10];
        IMONEY=money;
    }

    public void summary(){//총 구매가격을 알 수 있는 메소드
        //이렇게 for문을 써도 되고 아니면 buy라는 메소드에서 해결할 수 있다,
        int sum = 0;
        for(int i = 0; i<product2Arr.length; i++){
            Product2 p1 = product2Arr[i];
            if(p1 == null){
                break;
            }
            sum += p1.getPrice();
        }
        System.out.printf("총 구매가격은 %d만원입니다.", sum);
    }

    public void summary2(){//경록씨가 한 거
        System.out.printf("총 구매가격은 %d만원입니다.", sum2);
    }
    public void summary3(){//태형씨가 한 거
        int sum = 0;
        sum = IMONEY - money;
        System.out.printf("총 구매가격은 %d만원입니다.", sum);
    }


    public void buy(Product2 product2){

        if( product2 == null){//혹시나 들어올 null을 위해 예외처리
            System.out.println("잘못 구매하셨습니다.");
            return;
        }


        //만약 칸이 다 차고 money가 많다면 이게 먼저 막혀야 하고 아래 코드가 실행이 되면 안되니 이 코드 먼저 적어줘야한다.
        if(cun > product2Arr.length){//4. cun이 11이 되면 여기 걸러지면 아래 아무런 코드도 실행이 안되고
            //cun은 12 ,13, 14...이렇게 증가는 될 수 있게 했다.
            cun++;
            return;
        } else if (cun == product2Arr.length) {//3. cun이 10이 되었을 때만 나오는 출력문
            System.out.println("구매횟수를 초과했습니다. 인 당 10번만 구매 가능합니다");
            cun++;//그리고 여기서 ++되면서 11이 된다.
            return;
        }

        if(money<product2.getPrice()){
            System.out.println("금액 부족");
            return;// money가 Probuct2에 있는 price의 값보다 적어진다면 금액부족이 뜨고 아래 코드는 실행이 안되게 리턴
        }
        //앞의 이 조건문이 다 통과되었을 때 물품이 구매되어야 하니 순서 설정을 잘 해야한다


        System.out.printf("%s를 구매했습니다." , product2.getName());//getName로 해당되는 타입의 클래스에 가서
        //그 클래스에 맞게 바꿨던 name을 가져온다.
        money -= product2.getPrice();//buyer의 money에서 구매한 제품의 가격만큼 빼야하니 이 메소드를 사용해 -한다.
        bonusPoint += product2.getBonusPoint();//buyer의 bonusPoint에 구매한 제품의 10%를 넣어줘야 하니 이 메소드를 사용해 +한다.
        sum2 += product2.getPrice();
        System.out.printf("money : %d, bonusPoint : %d\n",money, bonusPoint);
        //구매할 때 마다 buyer의 남은 금액과 적립된 포인트를 아는 출력문

        product2Arr[cun++] = product2;//1. int cun = 0으로 선언해서 처음 0번방부터 파라미터에 들어온 해당 클래스의
        //값들을 넣어주고 cun은 ++되게 한다.
        //2. 계속 ++하다가 10이 되면 (이 배열의 마지막 방은 9번방이니깐) 위의 if문에 걸러진다.

    }


}

class Product2 {
    private String name;
    private int price;
    private int bonusPoint;

    public Product2(String name, int price){
        this.name = name;
        this.price = price;
        bonusPoint = price/10;
    }
    public Product2(){

    }

    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public int getBonusPoint(){
        return bonusPoint;
    }

@Override
    public String toString(){
        return String.format("name : %s, price : %d, bonusPoint : %d", name, price, bonusPoint);
    }


}

class Tv2 extends Product2{
    public Tv2(){
        super("Tv",100);
    }
}

class Computer2 extends Product2{
    public Computer2(){
        super("Computer", 200);
    }
}

class Audio2 extends Product2{
    public Audio2(){
        super("Audio", 500);
    }
}