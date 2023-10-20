package com.green.day17.ch7;

public class polyArgumentTest {
    public static void main(String[] args) {
        //product p = new product();
        Product p2 = new Product(100);
        //price에 100이 저장되어야 하고 bonusPoint에 price의 10%인 10이 저장
        System.out.println("p2 : " + p2);
        Product p3 = new Product(200);
        //이것듀
        System.out.println("p3 : " + p3);


        Tv tv = new Tv();
        System.out.println(tv);
        int price = tv.getPrice();
        int bonusPoint = tv.getBonusPoint();
        //price에는 100이 bonusPoint 10
        System.out.printf("tv : %d , %d\n",price,bonusPoint);


        Computer c = new Computer();
        System.out.println(c);
        int price2 = c.getPrice();
        int bonusPoint2 = c.getBonusPoint();

        System.out.printf("computer : %d , %d",price2,bonusPoint2);

    }
}




class Product{
    private int price;
    private int bonusPoint;

    public Product(){

    }

    public Product(int a){
        price = a;
        bonusPoint = a/10;//나누기보단 (int)(a*0.1)로하는 게 더 좋당
    }

    public int getPrice(){
        return price;
    }
    public int getBonusPoint(){
        return bonusPoint;
    }

    public String toString(){
        return String.format("%d, %d\n",price , bonusPoint);
    }
}

class Tv extends Product{


    public Tv(){
        super(100);//하드코딩 Tv는 몇번을 객체화 해도 100과 10을 갖게 된다
    }



    @Override
    public String toString(){
        return "Tv ";// super.toString(); //tv의 부모클래스 product에 오버라이딩된 toString을 불러온 것
    }


}

class Computer extends Product{

    public Computer(){
        super(200);
    }

    @Override
    public String toString(){
        return "Computer " ; // + super.toString(); tv의 부모클래스 product에 오버라이딩된 toString을 불러온 것
    }
}


class PolyArgumentTest2{
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        System.out.println(buyer);//money : 1000, bonusPoint : 0
        buyer.buy2(new Tv());//price 100
        buyer.buy2(new Computer());//price 200
        buyer.buy2(new Computer());//price 200
        buyer.buy2(new Computer());//price 200
        buyer.buy2(new Computer());//price 200
        buyer.buy2(new Computer());//price 200
        System.out.println(buyer);

        //buyer money가 부족하면 "잔액 부족" money값 마이너스 처리 X
        //잔액이 부족하지 않으면 Tv를 구입하셨습니다.> money 마이너스 처리, bonusPoint 플러스 처리



    }
}

class Buyer {

    private int money;
    private int bonusPoint;
    public Buyer(){
        money = 1050;
        bonusPoint =0;
    }
    public int getMoney(){
        return money;
    }
    public int getBonusPoint(){
        return bonusPoint;
    }

    public String toString(){
        return String.format("money : %d, bonusPoint : %d" , money, bonusPoint);
    }

  /*  public void buy(Tv tv){
        System.out.println("Tv price : "+tv.getPrice());
    }

    public void buy (Computer com){
        System.out.println("Computer price : " + com.getPrice());

    } 아래 처럼 한 번에 작성가능*/

    public void buy (Product product){
        System.out.printf("%s", product);
        System.out.println("price : " + product.getPrice());

    }

    public void buy2(Product product){
        if(money < product.getPrice()){
            System.out.println("잔액 부족");
            return;
        }
        System.out.printf("%s를 구매하셨습니다. " , product);

        money -=  product.getPrice();
        this.bonusPoint = bonusPoint + product.getBonusPoint(); //위 아래 아무렇게나 적어두 됨
        System.out.printf("money : %d, BonusPoint : %d\n", money, bonusPoint);
    }



}