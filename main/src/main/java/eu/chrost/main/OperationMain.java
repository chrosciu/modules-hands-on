package eu.chrost.main;

import eu.chrost.math.Operation;
import eu.chrost.utils.Logger;

import java.util.ServiceLoader;

class OperationMain {
    public static void main(String[] args) {
        ServiceLoader<Operation> operations = ServiceLoader.load(Operation.class);
        Logger logger = new Logger();

        for (Operation op : operations) {
            logger.log(op.getClass().getSimpleName() + " " + op.apply(10, 5));
        }
    }
}
