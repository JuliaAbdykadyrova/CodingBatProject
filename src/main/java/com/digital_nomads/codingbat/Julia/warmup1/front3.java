package com.digital_nomads.codingbat.Julia.warmup1;

public class front3 {
    public String front3(String str) {
        if (str.length() <= 3) {
            return str+str+str;
        } else {
            String three = str.substring(0,3);
            return three+three+three;
        }
    }
}
