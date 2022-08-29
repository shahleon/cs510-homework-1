package com;

public class Calculator {
    public double calculate(double number1, double number2, char operator) throws Exception {
        switch (operator) {
            case '+':
                return add(number1, number2);
            case '-':
                return subtract(number1, number2);
            case '*':
                return multiply(number1, number2);
            case '/':
                return divide(number1, number2);
            default:
                System.out.println(operator + " is an invalid operator" + System.lineSeparator());
                break;
        }
        throw new Exception("Invalid operator provided");
    }

    private static double add(double number1, double number2) {
        return number1 + number2;
    }

    private static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    private static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    private static double divide(double number1, double number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Divisor can not be zero");
        }
        return number1 / number2;
    }
}
