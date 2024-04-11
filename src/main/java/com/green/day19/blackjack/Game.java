package com.green.day19.blackjack;

import java.util.Scanner;

public class Game {
    private static final int INIT_RECEIVE_CARD_COUVT = 2;//게임 최초 받는 카드 수

    public void play() {

        System.out.println("_____________________________________");
        CardDeck cardDeck = new CardDeck();
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();

        initPhase(cardDeck, gamer, dealer);
        playingPhase(cardDeck, gamer, dealer);


        System.out.println("gamer : " + gamer.openCards());
        System.out.println("dealer : " + dealer.openCards());
        rule.whoIsWinner(gamer, dealer);

    }

    private void playingPhase(final CardDeck cardDeck, final Gamer gamer, final Dealer dealer) {
        Scanner scan = new Scanner(System.in);
        int aa = 0;

        //게이머가 0을 입력할 때 까지 카드를 뽑느다.
        // scan.clase();

        while (true) {
            System.out.println(gamer.openCards());
            System.out.println("카드를 뽑겠습니까.? 종료를 원하시면 0을 입력하세요 >>> ");
            aa = scan.nextInt();


            if (aa == 0) {
                break;
            }else if(aa != 0){
                gamer.receiveCard(cardDeck.draw());
            }

        }
//        System.out.println("gamer : " + gamer.openCards());
//        System.out.println("dealer : " + dealer.openCards());

    }

    private void initPhase(final CardDeck cardDeck, final Gamer gamer, final Dealer dealer) {
        System.out.println("처음 2장의 카드를 각자 뽑겠습니다.");

//        Card c = cardDeck.draw();


        for (int i = 0; i < INIT_RECEIVE_CARD_COUVT; i++) {
            dealer.receiveCard(cardDeck.draw());
            gamer.receiveCard(cardDeck.draw());
        }
        //딜러가 16점 이하면 카드한장 더 받을수 있도록해주세요
        if (dealer.isMoreReceiveCard()) {
            dealer.receiveCard(cardDeck.draw());
        }

    }


}


