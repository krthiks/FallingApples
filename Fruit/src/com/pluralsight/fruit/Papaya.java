package com.pluralsight.fruit;

public class Papaya implements ITastyFruit {



    private int foo;
    private int zoo = 1;

    public int getFoo() {
        return foo;
    }

    public void setFoo(int foo) {
        this.foo = foo;
    }

    public int getZoo() {
        return zoo;
    }

    public void setZoo(int zoo) {
        this.zoo = zoo;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getRollMultiplierAll() {
        return 0;
    }
}
