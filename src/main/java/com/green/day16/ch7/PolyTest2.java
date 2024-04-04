package com.green.day16.ch7;

public class PolyTest2 {
    public static void main(String[] args){
        Dog dog = new Dog();
        BullDog bullDog = new BullDog();
        Cat cat = new Cat();

        doCrying(dog);
        doCrying(bullDog);
        doCrying(cat);

    }

    public static void doCrying(Animal ani){
//        ani.crying();
//        if(ani instanceof Dog){
//            ((Dog)ani).sleep();}
        if(ani instanceof Dog dog){
            dog.sleep();
        }
    }




}
