package com.green.day15.ch7;

public class FinalTest {
    public static void main (String[] args){
        Car c = new Car(2200);
//        c.cc = 100;
        Car c2 = new Car(3000);
    }
}

class Car{
    final int CC;

    Car(){
        CC = 100;
    }

    Car(int cc){
        this.CC = cc;
    }
}


class Suv extends Car{

}

class Tucson extends Suv {

}