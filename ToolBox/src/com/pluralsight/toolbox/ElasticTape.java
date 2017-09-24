package com.pluralsight.toolbox;

import com.pluralsight.fruit.ITastyFruit;
import com.pluralsight.fruit.Tree;

import java.util.Random;

class ElasticTape {


    // TODO: Implement a Measuring Tape that actually measures distances
    public double   getDistance(Tree tree, ITastyFruit fruit) {

        Random random = new Random();
        return random.nextDouble() * 10 * fruit.getRollMultiplierAll();

    }

    // TODO: Implement a Measuring Tape that actually measures distances
    public double getDistance1(Tree tree, ITastyFruit fruit) {


        System.out.println("tree = " + tree.getFruitOnTree());

        Random random = null;
        try {
            random = new Random();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return random.nextDouble() * 10 * fruit.getRollMultiplierAll();

    }
}
