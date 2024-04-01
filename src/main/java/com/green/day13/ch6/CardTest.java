package com.green.day13.ch6;

public class CardTest {
    public static void main(String[]args){
        //클로버, 하트, 다이아, 스페이드
        //A,1,2,3,4,5,6,7,8,9,10,J,Q,K

        int idx = 0;
        Card[] cards = new Card[52];
        String[] shapes = {"Heart","Diamond","Clova","Spade"};

        for(int i=0; i< shapes.length; i++){
            for(int z =1; z<=13; z++){
                Card c = new Card();
                c.shape  = shapes[i];
                c.number = switch (z){
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(z);
                };
                cards[idx++] = c;

            }
        }
        System.out.println("_________________________");
        for(Card c : cards){
            System.out.printf("%s(%s)\n", c.shape,c.number);
        }







    }

}
