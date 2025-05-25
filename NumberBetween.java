package question3;
import java.util.Scanner;

public class NumberBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a number between 1 and 10: ");
            number = scanner.nextInt();

            if (number >= 1 && number <= 10) {
                System.out.println(number + " is between 1 and 10. Thank you!");
                break;
            } else {
                System.out.println(number + " is not between 1 and 10. Try again.");
            }
        }

        scanner.close();
    }

	}


