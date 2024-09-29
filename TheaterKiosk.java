import java.util.Scanner;

// Class for Problem 4: TheaterKiosk
class Problem4 {

    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");

        if (in.hasNextInt()) {
            int age = in.nextInt(); // Read input as an integer

            // Check if the user is 21 or older
            if (age >= 21) {

                System.out.println("You get a wristband.");
            } else {
                System.out.println("You do not get a wristband.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid age.");
        }
    }
}