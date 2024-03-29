package com.green.day12.ch6;

public class CardTest {
    public static void main(String[] args) {
        System.out.println(Card.width);
        System.out.println(Card.height);

        Card.width = 110;
        System.out.println(Card.width);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        System.out.println(c1.kind + c1.number);


        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;
        c1.width = 200;

        System.out.println(c2.kind + c2.number);
        System.out.println("c1.width : " + c1.width);
        System.out.println("c2.width : " + c2.width);
        System.out.println("Card.width : " + Card.width);
// 한개 바꾸면 다 바ㅜ김
    }
}
