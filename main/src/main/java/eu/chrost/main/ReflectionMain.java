package eu.chrost.main;

import java.lang.reflect.Field;

class ReflectionMain {
    public static void main(String[] args) throws Exception {
        Class<?> personClass = Class.forName("eu.chrost.model.Person");
        Object personInstance = personClass.getDeclaredConstructor().newInstance();

        // Odczytanie prywatnego pola "name"
        Field nameField = personClass.getDeclaredField("name");
        nameField.setAccessible(true); // Uzyskanie dostępu refleksyjnego
        String name = (String) nameField.get(personInstance);
        System.out.println("Name: " + name);
    }
}
