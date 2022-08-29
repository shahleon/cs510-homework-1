package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String supportedOperations = "+-/*";
        String input;

        try {
            do {
                double firstNumber, secondNumber;
                System.out.println("The first number is: ");
                firstNumber = getNumber(1);

                System.out.println("Enter operator: +, -, * or /");
                char operator = reader.readLine().charAt(0);
                if (supportedOperations.indexOf(operator) == -1) {
                    throw new Exception("Invalid operator provided");
                }

                System.out.println("The second number is:");
                secondNumber = getNumber(2);

                Double result = Calculator.calculate(firstNumber, secondNumber, operator);
                if (result == null) {
                    System.out.println("Could not calculate result");
                }
                System.out.println("Result is: "+ result);

                System.out.println("Continue? Y/N");
                input = reader.readLine();
            }
            while (input.equalsIgnoreCase("Y"));
            reader.close();
        } catch (Exception ex) {
            System.out.println("An exception occurred: " + ex.getMessage());
        }
    }

    private static Double getNumber(int i) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Double number = null;
        do {
            try {
                number = Double.valueOf(reader.readLine());
                System.out.println("Number " + i + " is " + number);
            } catch (NumberFormatException e) {
                System.out.println("Wrong number format: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("It is not a number: " + e.getMessage());
            }
        }
        while (number == null);

        return number;
    }
}
