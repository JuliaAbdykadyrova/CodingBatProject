package com.digital_nomads.codingbat.Julia.warmup1;

public class close10 { public int close10(int a, int b) {
    int aDiff = Math.abs(a-10);
    int bDiff = Math.abs(b-10);
    if (aDiff < bDiff) {
        return a;
    } else if (bDiff < aDiff) {
        return b;
    } else {
        return 0; // одинаково близко
    }
}
}
