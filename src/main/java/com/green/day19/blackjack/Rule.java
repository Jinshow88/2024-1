package com.green.day19.blackjack;

public class Rule {
    void whoIsWinner(Gamer gamer, Dealer dealer) {
        int gamerpoint =0;
        int dealerpoint = 0;
        for (int i = 0; i < gamer.cards.size(); i++) {
            gamerpoint += gamer.cards.get(i).getPoint();

        }
        for(int i=0; i<gamer.cards.size(); i++){
            dealerpoint += gamer.cards.get(i).getPoint();
        }

        if(gamerpoint < dealerpoint || gamerpoint>21 ){
            System.out.println("딜러 승!!");
        }else if (gamerpoint > dealerpoint || dealerpoint >21){
            System.out.println("게이머 승!!");
        }else {
            System.out.println("비겼습니다.!!");
        }

    }
}