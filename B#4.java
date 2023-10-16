import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: "); // tells the user to input their age
        int age = scanner.nextInt();

        if (age < 13) {  // if your age is less than 13 than you are a child 
            System.out.println("You are a child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a teen.");   // if your age is less than or equal to 19 and greater than or equal to 13 you are a teen 
        } else if (age >= 20 && age <= 65) {
            System.out.println("You are an adult.");    // if your age is greater than or equal to 20 and less than or equal to 65 you are an adult
        } else {
            System.out.println("You are a senior citizen.");
        }
    }
}
