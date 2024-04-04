package com.green.day16.ch7;
/*
<다형성 대전제 3가지>
1. 부모 타입의 변수는 자식 객체 주소값 담을 수 있다.
2. 자식 타입의 변수는 부모 객체 주소값 담을 수 없다.
3. 타입은 알고 있는 메소드만 호출 할 수 있고 실행 되는 기준은 객체 기준이다.

 */
public class PolyTest {
    public static void main(String[]args){
//        1. 부모 타입의 변수는 자식 객체 주소값 담을 수 있다.
        Animal ani1 = new Dog();
        Animal ani2 = new BullDog();
        Animal ani3 = new Cat();
        Dog dog1= new BullDog();
//        2. 자식 타입의 변수는 부모 객체 주소값 담을 수 없다.
//        Dog dog2 = new Animal(); 컴파일 에러 >>> 실행조차 안된다
//        Dog dog3 = (Dog)new Animal(); 실행은 되는데 에러가 터짐

//        3. 타입은 알고 있는 메소드만 호출 할 수 있고 실행 되는 기준은 객체 기준이다.

        ani1.crying();
//        ani1.sleep();
        Dog dog4 = (Dog)ani1;// >>> 강제 형변환
        dog4.sleep();
//        ani2.sleep();
        Dog dog5 = (BullDog)ani2;
        dog5.sleep();

    }
}

class Animal{
    void crying(){ System.out.println("동물이 운다.)");}
//    void sleep(){System.out.println("강아지가 잔다");}
}
class Dog extends Animal{
    void crying(){System.out.println("강아지가 멍멍");}
    void sleep(){System.out.println("강아지가 잔다");}
}

class BullDog extends Dog{
    void crying(){System.out.println("불독이 월월");}
    void sleep(){System.out.println("불족이 잔다");}
}

class Cat extends Animal {
    void crying(){System.out.println("고양이가 야옹");}
}