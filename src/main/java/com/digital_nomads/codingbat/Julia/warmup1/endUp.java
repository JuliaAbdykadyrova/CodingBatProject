package com.digital_nomads.codingbat.Julia.warmup1;

public class endUp { public String endUp(String str) {
    if (str.length()>3) {
        String end = str.substring(str.length()-3).toUpperCase();
        String start = str.substring(0, str.length()-3);
        return start+end;
    } else return str.toUpperCase();
}
}
