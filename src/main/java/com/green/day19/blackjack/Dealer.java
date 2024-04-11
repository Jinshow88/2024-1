package com.green.day19.blackjack;

public class Dealer extends Gamer{
    private static final int CAN_RECEIVE_POINT = 16;

    public boolean isMoreReceiveCard(){
       int totalpoint = 0;
       for(Card card : cards){
           totalpoint += card.getPoint();
        }
        return totalpoint <= CAN_RECEIVE_POINT;
    }



}

//
//class DealerTest {
//    public static void main(String[]args){
//        Dealer dealer = new Dealer();
//        dealer.receiveCard(new Card("Heart","K"));
//        dealer.receiveCard(new Card("Spade","K"));
//        boolean answer = dealer.isMoreReceiveCard();
//    }
//}