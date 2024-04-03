package com.green.day15.ch7;

public class AbstractTest {
    public static void main(String[] args){
        //Dog d = new Dog(); <<<< 추상 클래스는 객체화 불가능
    }
}

abstract class Dog{//추상 클래스

}

abstract class Cat{//추상 메소드를 하나만 가지고 있어도 추상 클래스가 되오야 한다.
    //추상 메소드
    abstract void crying();
}

class KoreaShort extends Cat{

    @Override
    void crying(){
        System.out.println("야옹~ 야옹~");
    }
}

class AmericaCat extends Cat{
    @Override
    void crying(){
        System.out.println("미유~~ 미유~~");
    }

}