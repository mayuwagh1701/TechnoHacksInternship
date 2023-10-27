package com.TechnoHacks.Internship;

import java.util.Scanner;

/* Task:01 >>  Calculator
Create a basic calculator that can perfor basic arithmetic operations such as addition,
subtraction, multiplication, and division.  */
public class BasicCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		
        double number1, number2, result;

        do {
            System.out.println("Choose an operation: ");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1/2/3/4/5): ");

          int  operator = sc.next().charAt(0);

            if (operator == '5') {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            System.out.print("Enter the first number: ");
            number1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            number2 = sc.nextDouble();

            switch (operator) {
                case '1':
                    result = number1 + number2;
                    System.out.println("Result: " + result);
                    break;
                case '2':
                    result = number1 - number2;
                    System.out.println("Result: " + result);
                    break;
                case '3':
                    result = number1 * number2;
                    System.out.println("Result: " + result);
                    break;
                case '4':
                    if (number2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        result = number1 / number2;
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid input. Please select a valid operation.");
            }
            System.out.println("Do you want to continue? yes/no");
           c= sc.next().charAt(0);

        } while (c=='y' || c== 'Y');

       
    }

}
