package com.green.day19.blackjack;

public class Card {
    private String pattern;//무늬
    private String denomination;//숫자


    public Card(String pattern, String denomintation){
        this.pattern = pattern;
        this.denomination = denomintation;

    }

    public String getPattern(){
        return pattern;
    }
    public String getDenomination() {
        return denomination;
    }
    @Override
    public String toString(){
        return String.format("%s(%s)",this.pattern,this.denomination);
    }

    public int getPoint(){
         int score = switch (denomination){
             case "A"-> 1;
             case "10","J", "Q", "K"-> 10;
             default -> Integer.parseInt(denomination);
         };
         return score;
    }



}

class CardTest{



    public static void main(String[]args){
        Card c = new Card("Spade","A");
        //기본 생성자는 없어야함
        String pattern = c.getPattern();
        String denomination = c.getDenomination();
        System.out.println(c);//Spdae(A)

        int score = c.getPoint();


    }
}