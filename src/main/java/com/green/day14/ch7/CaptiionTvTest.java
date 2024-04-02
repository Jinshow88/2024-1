package com.green.day14.ch7;
//자식이 부모보다 더 작아질 수 있나요? 없다
public class CaptiionTvTest {
    public static void main(String[] args){
        CaptionTv cTv = new CaptionTv();
        cTv.channel = 10;
        cTv.power();
        cTv.channelUp();
        cTv.channelDown();
        System.out.printf("cTv.channel : \n" + cTv.channel);
        cTv.caption = true;
        cTv.displayCaption("dnflgmlwjdlsmstprtmfmfwhgdkgo");
    }

}


class Tv{
    boolean power;
    int channel;

    void power(){ power =!power;}
    void channelUp(){channel++;}
    void channelDown() { channel--;}


}

class VideoTv extends Tv{

}



class CaptionTv extends Tv{
    boolean caption;

    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
}
