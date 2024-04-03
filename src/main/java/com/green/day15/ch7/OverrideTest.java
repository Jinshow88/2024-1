package com.green.day15.ch7;

public class OverrideTest {
    public static void main(String[] args) {
        Parent p = new Parent(55);

        Child child = new Child();
        child.attack();
    }
}

class Parent {

    int age;// 리턴타입이 없다. 클래스명과 같다.

    Parent(int age){
        this.age = age;
    }


    void attack(){
        System.out.println("부모가 공격한다.");
    }

    public void defense(){
        System.out.println("부모가 방어한다.");
    }

}

class Child extends Parent {
    int mzPower;


    public Child(){
        super(11);
    }


    @Override //애노테이션 Annotation>>> 오버라이딩이 맞는지 아닌지 체크를 함
    void attack(){
        System.out.println("자식이 공격한다.");
    }
    public void doubleAttack(){
        this.defense();
        super.defense();
    }
}