package com.digital_nomads.codingbat.Julia.warmup1;

public class stringE {
    public boolean stringE(String str) {
        int count = 0;
        for ( int i =0; i < str.length(); i ++) {
            if (str.charAt(i) == 'e') {
                count ++;
            }
        }
        return count <= 3 && count >=1;
    }
}
