package com.ironyard;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your first number:");
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        System.out.println("Enter your second number:");
        String string2 = scanner.nextLine();
        Double operand1 = java.lang.Double.parseDouble(string1);
        Double operand2 = java.lang.Double.parseDouble(string2);
        Double sum = operand1 + operand2;
        Double difference = operand1 - operand2;
        Double quotient = operand1 / operand2;
        Double product = operand1 * operand2;
        Double remainder = operand1 % operand2;
        showResults(sum, difference, quotient, product, remainder);
    }
    public static void showResults(Double sum, Double difference, Double quotient, Double product, Double remainder) {
        System.out.println("The sum of your numbers is: " + sum);
        System.out.println("The difference of your numbers is: " + difference);
        System.out.println("The quotient of your numbers is: " + quotient);
        System.out.println("The product of your numbers is: " + product);
        System.out.println("The remainder when the first is divided by the second is: " + remainder);
    }

}