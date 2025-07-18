package com.digital_nomads.codingbat.Julia.warmup1;

public class everyNth {
    public String everyNth(String str, int n) {
        String nChar = "";
        for (int i = 0; i < str.length(); i +=n) {
            nChar+=str.charAt(i);
        }
        return nChar;
    }
}
