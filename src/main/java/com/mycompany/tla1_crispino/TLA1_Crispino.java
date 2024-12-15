/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tla1_crispino;
import java.util.Scanner;
/**
 *
 * @author matth
 */




public class TLA1_Crispino   {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            // Display the menu
            System.out.println("Select an operation:");
            System.out.println("7 - Addition");
            System.out.println("8 - Subtraction");
            System.out.println("9 - Multiplication");
            System.out.println("3 - Division");
            System.out.println("6 - Exit");
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();

            if (option == 6) {
                break;
            }

            // Input numbers
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Perform the selected operation
            switch (option) {
                case 7:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 8:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 9:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 3:
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
            System.out.println(); // Blank line for separation

        } while (true);

        System.out.println("Program terminated.");
        scanner.close();
    }
}