package com.digital_nomads.codingbat.Julia.warmup1;

public class PosNeg { public boolean posNeg(int a, int b, boolean negative) {
    if (negative) {
        return a < 0 && b < 0;
    } else {
        return (a < 0 && b > 0) || ( b < 0 && a > 0);
    }
}
}
