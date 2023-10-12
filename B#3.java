import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double smallest = Math.max(Math.max(num1, num2), num3); // Use Math.max to find the largest number

        System.out.println("The largest number is: " + smallest);
    }
}
