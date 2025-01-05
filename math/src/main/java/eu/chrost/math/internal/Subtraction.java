package eu.chrost.math.internal;

import eu.chrost.math.Operation;

public class Subtraction implements Operation {
    @Override
    public int apply(int a, int b) {
        return a - b;
    }
}
