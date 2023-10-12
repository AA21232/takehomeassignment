import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where are you from? ");
        String region = scanner.nextLine();

        // Create a switch statement to provide trivia based on the region
        switch (region) {
            case "Canada":
                System.out.println("Canada is known for its beautiful national parks.");
                break;
            case "France":
                System.out.println("France is famous for its exquisite cuisine.");
                break;
            // Add more cases for other regions
            default:
                System.out.println("I don't know anything about " + region);
        }
    }
}
