package com.amuriel.amuriel.heking;

import lombok.Getter;

@Getter
public class Multiplicator {
    private long multiplier;

    public Multiplicator(long multiplier) {
        this.multiplier = multiplier;
    }

    public long process(long multiplicand) {
        return 0;
    }
}
