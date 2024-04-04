package com.green.day16.ch7;

public class PolyTest3 {
    public static void main(String[]args){
        BullDog bullDog = new BullDog();

//        Animal ani = new Animal();

        boolean r = bullDog instanceof Dog;
        System.out.println ("r : " + r);//형변환이 가능한지 확인

        Animal ani = new Animal();
        System.out.println("ani instanceof Dog : " + (ani instanceof Animal ));

        ani = new BullDog();
        System.out.println("ani instanceof Dog : " + (ani instanceof Dog ));
    }
}
