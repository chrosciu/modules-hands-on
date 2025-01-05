package eu.chrost.main;

import eu.chrost.math.Operation;
import eu.chrost.utils.Logger;

import java.util.ServiceLoader;

class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        ServiceLoader<Operation> operations = ServiceLoader.load(Operation.class);
        for (Operation op : operations) {
            logger.log(Integer.toString(op.apply(10, 5)));
        }
    }
}
