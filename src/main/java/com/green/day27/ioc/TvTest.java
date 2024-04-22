package com.green.day27.ioc;

import com.green.day27.Tv;

public class TvTest {
    public static void main(String[] args){
        TvFactory tvFactory= TvFactory.getInstance();
        String TvName = "lg";
        String SpeakerName = "bose";
        String wooferName = "marten";

        Tv tv = tvFactory.factory(TvName,SpeakerName,wooferName);
        tv.sound();
    }
}
