import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner for user input
        Random random = new Random(); // Create a random number generator

        int correctCount = 0; // Initialize a count for correct answers

        for (int i = 0; i < 3; i++) { // Loop three times to ask three math problems
            int num1 = random.nextInt(10); // Generate a random number between 0 and 9
            int num2 = random.nextInt(10); // Generate another random number between 0 and 9

            System.out.println("What is " + num1 + " + " + num2 + "?"); // Display the math problem
            int userAnswer = scanner.nextInt(); // Read the user's answer

            int correctAnswer = num1 + num2; // Calculate the correct answer

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!"); // If the user's answer matches the correct answer, display "Correct!" and increase the correct count
                correctCount++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + correctAnswer); // If the user's answer is incorrect, display the correct answer
            }
        }

        System.out.println("You got " + correctCount + " out of 3 math problems correct."); // Display the total number of correct answers
    }
}
