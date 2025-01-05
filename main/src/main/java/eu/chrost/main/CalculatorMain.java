package eu.chrost.main;

import eu.chrost.math.Calculator;
import eu.chrost.math.Operation;
import eu.chrost.utils.Logger;

import java.util.ServiceLoader;


class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Logger logger = new Logger();

        logger.log("Sum: " + calculator.add(2, 3));
        logger.log("Difference: " + calculator.subtract(5, 3));

        ServiceLoader<Operation> operations = ServiceLoader.load(Operation.class);
        for (Operation op : operations) {
            logger.log(Integer.toString(op.apply(10, 5)));
        }
    }
}
