package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        Calculator calculator = new Calculator();

        try {
            do {
                double firstNumber, secondNumber;
                System.out.println("The first number is: ");
                firstNumber = getNumber(1);

                System.out.println("Enter operator: +, -, * or /");
                char operator = reader.readLine().charAt(0);

                System.out.println("The second number is:");
                secondNumber = getNumber(2);

                calculator.calculate(firstNumber, secondNumber, operator);

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
