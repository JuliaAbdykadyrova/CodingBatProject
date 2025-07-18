package com.digital_nomads.codingbat.Julia.warmup1;

public class frontBack {
    public String frontBack(String str) {
        if ( str.length() <=1 ) {
            return str;
        }
        String begin = str.substring(0, 1);
        String middle = str.substring(1, str.length()-1);
        String end = str.substring(str.length()-1);


        return end + middle + begin;
    }
}
