package eu.chrost.math;

import eu.chrost.utils.Logger;

public class Calculator {
    private final Logger logger = new Logger();

    public int add(int a, int b) {
        logger.log("Adding " + a + " and " + b);
        return a + b;
    }

    public int subtract(int a, int b) {
        logger.log("Subtracting " + b + " from " + a);
        return a - b;
    }
}

