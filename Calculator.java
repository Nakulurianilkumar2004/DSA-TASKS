package question1;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Taking input
	        System.out.print("Enter first number (num1): ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter second number (num2): ");
	        double num2 = scanner.nextDouble();

	        System.out.print("Enter an operator (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);

	        double result;

	        // Performing operation based on operator
	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                System.out.println("Result: " + result);
	                break;
	            case '-':
	                result = num1 - num2;
	                System.out.println("Result: " + result);
	                break;
	            case '*':
	                result = num1 * num2;
	                System.out.println("Result: " + result);
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Result: " + result);
	                } else {
	                    System.out.println("Error: Division by zero!");
	                }
	                break;
	            default:
	                System.out.println("Invalid operator!");
	        }

	        scanner.close();
	    }

	}


