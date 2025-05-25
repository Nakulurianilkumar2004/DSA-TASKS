package question4;
import java.util.Scanner;

public class NumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int number;

        // Use a do-while loop to validate the input
        do {
            System.out.print("Enter a number between 1 and 10: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);

        System.out.println(number + " is between 1 and 10.");
        scanner.close();
    }


	}


