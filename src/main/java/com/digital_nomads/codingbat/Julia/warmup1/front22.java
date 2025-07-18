package com.digital_nomads.codingbat.Julia.warmup1;

public class front22 {
    public String front22(String str) {
        if (str.length() <= 2) {
            return str + str + str;
        } else {
            String begin = str.substring(0, 2);
            return begin + str + begin;
        }

    }
}
