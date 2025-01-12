package eu.chrost.main;

import eu.chrost.math.Calculator;
import eu.chrost.utils.Logger;

class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Logger logger = new Logger();

        logger.log("Sum: " + calculator.add(2, 3));
        logger.log("Difference: " + calculator.subtract(5, 3));
    }
}
