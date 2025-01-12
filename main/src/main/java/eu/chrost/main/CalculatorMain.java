package eu.chrost.main;

import eu.chrost.math.Calculator;

class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum: " + calculator.add(2, 3));
        System.out.println("Difference: " + calculator.subtract(5, 3));
    }
}
