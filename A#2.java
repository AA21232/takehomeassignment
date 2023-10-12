import java.util.Scanner;

  public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: "); // Get the first number from the user
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: "); // Get the second number from the user
        double num2 = scanner.nextDouble();

  // Compare the two numbers and show a message
        if (num1 > num2) {
            System.out.println(num1 + " is larger than " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " is larger than " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
