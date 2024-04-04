package com.green.day16.ch7;

public interface PlayingCard {
    // public static final자동으로 붙는다.
    int CLOVER = 1;

    //public abstract 자동으로 붙는다.
    String getCardNumber();
}

interface DeepPlayingCard extends PlayingCard {
    String getCardKind();
}

class PlayCard implements DeepPlayingCard {

    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }
}

class PlayCardTest {
    public static void main(String[]args){
        PlayingCard pc = new PlayCard();
        pc.getCardNumber();
        DeepPlayingCard dlc = (DeepPlayingCard) pc;
        dlc.getCardKind();
        System.out.println("__________________________________");
    }
}
