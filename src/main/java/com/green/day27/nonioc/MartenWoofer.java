package com.green.day27.nonioc;

import com.green.day27.Woofer;

public class MartenWoofer implements Woofer {
    @Override
    public void soundBase() {
        System.out.println("Marten Woofer : 웅~ 웅~ 웅~");
    }
}
