package com.green.day16.ch7;

public class PolyArgementTest {
    public static void main(String[] args) {
//        Product p = new Product(1000);
//        System.out.println(p);
//        Product p2 = new Product(500);
//        System.out.println(p2);

//        p.getPrice();
//        System.out.println(p.getPrice());
//        p.getBonusPoint();
//        System.out.println(p.getBonusPoint());
//
//        p2.getPrice();
//        System.out.println(p2.getPrice());
//        p2.getBonusPoint();
//        System.out.println(p2.getBonusPoint());
//        Tv tv = new Tv();
//        System.out.println(tv);//Tv price :100, bonusPoint : 10
//
//
//
//        Computer computer = new Computer();
//        System.out.println(computer);

        Buyer buyer = new Buyer(20000);
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Sofa());
//        buyer.showMeTheMoney();


    }
}
class Buyer {
    private int havrMoney;
    private int haveBonusPoint;

    Buyer(int havrMoney){
        this.havrMoney = havrMoney;
        System.out.printf("%s\n",havrMoney);

    }

    public void buy(Product product){
        this.havrMoney = havrMoney-product.getPrice();
        this.haveBonusPoint = haveBonusPoint +product.getBonusPoint();
        System.out.printf("%s남았습니다.%s포인트 쌓였습니다.(%s)\n", havrMoney,product.getBonusPoint(),product.getPrice());
    }

//    void showMeTheMoney(){
//        this.showMeTheMoney =
    }




class Computer extends Product {
    Computer() {
        super(100);
    }

    @Override
    public String toString() {
        return String.format("Computer %s", super.toString());
    }
}

class Tv extends Product {
    Tv() {
        super(200);
    }
    @Override
    public String toString() {
        return String.format("Tv %s", super.toString());
    }
}

class Product {
    private int price;
    private int bonusPoint;


    public String toString() {
        return String.format("price : %,d bonusPoint : %,d", price, bonusPoint);
    }

    Product(int n1) {

        this.price = n1;
        this.bonusPoint = n1 / 10;


    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }
}

class Sofa extends Product {
    Sofa() {
        super(100);
    }

    @Override
    public String toString() {
        return String.format("Sofa %s", super.toString());
    }
}









