package com.digital_nomads.codingbat.Julia.warmup1;

public class delBel { public String delDel(String str) {
    if (str.length() > 3 && str.substring(1,4).equals("del")) {
        return str.substring(0,1) + str.substring(4);
    } else {
        return str;
    }
}
}
