package com.green.day19.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    public static final String[] PATTERNS = {"Spade", "Heart", "Diamond", "Club"};
    public static final int CARD_COUNT = 13;
    private List<Card> list;

    public CardDeck() {
        list = new ArrayList<>();
        for (int i = 0; i < PATTERNS.length; i++) {
            for (int e = 1; e <= CARD_COUNT; e++) {
                String pattern = PATTERNS[i];
                String denomination = getDenomination(e);
                Card c = new Card(pattern, denomination);

                list.add(c);
            }
        }
    }

    public String getDenomination(int z) {
        return switch (z) {
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> "" + z;
        };
    }

    public void showCards(){
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }


    public Card draw(){
        int dr = (int)(Math.random()* list.size());

        return list.remove(dr);
    }



}


class CardDeckTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        // 모든 카드의 pattern과 denomination출력
        //기본 생성자에서 PATTERNS, CARD_COUNT를 활용하여
        // 52장의 카드 객체를 생성하여 list에 추가해 주세요


        Card c = cd.draw();//랜덤한 카드 객체 주소값 리턴
        System.out.println("c : "+c);
        cd.showCards();
    }
}
