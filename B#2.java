import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double smallest = Math.min(Math.min(num1, num2), num3); // Use Math.min to find the smallest number

        System.out.println("The smallest number is: " + smallest);
    }
}
