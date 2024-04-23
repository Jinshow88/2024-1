package com.green.day27.ioc;

import com.green.day27.Speaker;
import com.green.day27.Tv;
import com.green.day27.Woofer;
import com.green.day27.HanilWoofer;
import com.green.day27.MartenWoofer;

public class TvFactory {
    // SingleTon 패턴, 싱클톤 패턴
    private static TvFactory tvFactory;


    public static TvFactory getInstance(){
        if(tvFactory == null){
            tvFactory = new TvFactory();
        }
        return tvFactory;
    }

    private TvFactory() {}

    public Tv factory(String TvName, String SpeakerName, String wooferName){
        Woofer woofer = switch (wooferName){
            case "hanill" -> new HanilWoofer();
            case "marten" -> new MartenWoofer();
            default -> null;
        };
        Speaker speaker = switch (SpeakerName){
            case "bose" -> new BoseSpeaker(woofer);
            case "genelec" -> new GenelecSpeaker(woofer);
            default -> null;
        };
        Tv tv = switch (TvName){
            case "lg" -> new LgTv(speaker);
            case "apple" -> new AppleTv(speaker);
            default -> null;

        };
        return tv;
    }
}
