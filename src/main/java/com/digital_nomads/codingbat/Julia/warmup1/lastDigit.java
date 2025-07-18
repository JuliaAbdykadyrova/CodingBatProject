package com.digital_nomads.codingbat.Julia.warmup1;

public class lastDigit {
    public boolean lastDigit(int a, int b) {
    int lastA = a%10;
    int lastB = b%10;

    return lastA == lastB;
}
}
