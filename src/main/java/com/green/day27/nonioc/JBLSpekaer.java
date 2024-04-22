package com.green.day27.nonioc;

import com.green.day27.Speaker;
import com.green.day27.Woofer;

public class JBLSpekaer implements Speaker {

    private Woofer woofer;

    public JBLSpekaer(){
        woofer = new MartenWoofer();
    }


    @Override
    public void sound() {
        System.out.println("JBL Speaker : 소리가 깔끔하다.");
        woofer.soundBase();
    }
}
