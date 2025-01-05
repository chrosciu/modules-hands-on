package eu.chrost.main;

import eu.chrost.math.Operation;
import eu.chrost.utils.Logger;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

class Main {
    public static void main(String[] args) throws Exception {
        Logger logger = new Logger();
        ServiceLoader<Operation> operations = ServiceLoader.load(Operation.class);
        for (Operation op : operations) {
            logger.log(Integer.toString(op.apply(10, 5)));
        }

        Class<?> personClass = Class.forName("eu.chrost.model.Person");
        Object personInstance = personClass.getDeclaredConstructor().newInstance();

        // Odczytanie prywatnego pola "name"
        Field nameField = personClass.getDeclaredField("name");
        nameField.setAccessible(true); // Uzyskanie dostępu refleksyjnego
        String name = (String) nameField.get(personInstance);
        System.out.println("Name: " + name);
    }
}
