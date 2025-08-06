

public class LuckyNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a 4-digit number: ");
        String input = scanner.nextLine();

        // Check if input is exactly 4 digits
        if (input.length() == 4 && input.matches("\\d{4}")) {
            int digit1 = Character.getNumericValue(input.charAt(0));
            int digit2 = Character.getNumericValue(input.charAt(1));
            int digit3 = Character.getNumericValue(input.charAt(2));
            int digit4 = Character.getNumericValue(input.charAt(3));

            int sum1 = digit1 + digit2;
            int sum2 = digit3 + digit4;

            if (sum1 == sum2) {
                System.out.println(input + " is a Lucky number!");
            } else {
                System.out.println(input + " is NOT a Lucky number.");
            }
        } else {
            System.out.println("Error: Please enter a valid 4-digit number.");
        }

        scanner.close();
    }

	}



