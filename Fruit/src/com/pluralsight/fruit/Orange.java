package com.pluralsight.fruit;


public class Orange implements ITastyFruit {



    private static final String NAME = "orange";
    private static final int ROLL_MULTIPLIER = 101;

    public String getName() {
        return NAME;
    }

    public int getRollMultiplierAll() {
        return ROLL_MULTIPLIER;
    }
}

