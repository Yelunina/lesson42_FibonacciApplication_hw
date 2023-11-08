package ait.fibonacci.model;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int quantity;
    private int pred;
    private int predPred;
    private int counter;

    public FibonacciIterator(int quantity) {
        this.quantity = quantity;
        pred = 1;
        predPred = 1;
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < quantity;
    }

    @Override
    public Integer next() {
        if (counter < 2) {
            counter++;
            return 1;
        }
        counter++;
        int temp = pred;
        pred += predPred;
        predPred = temp;
        return pred;
    }
}