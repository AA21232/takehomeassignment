import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a scanner to read user input
        String programmerName = "Adam";  // Store the programmer's name as "Adam"
        
        System.out.print("Enter your name: ");  // Prompt the user to enter their name
        String userName = input.nextLine();   // Read the user's name from input
        
        if (userName.equals(programmerName)) {
            System.out.println("We have the same name!");  // If the user's name matches the programmer's name, display this message
        
        } else {
            System.out.println("Your name is different from mine!");  // If the names don't match, display this message
        }
    }
}
