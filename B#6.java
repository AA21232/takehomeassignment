import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner to read user input
        System.out.print("Choose your language (e = English, s = Spanish, f = French): "); // Prompt the user to choose a language
        char choice = scanner.next().charAt(0); // Read the user's language choice

        // Display a greeting based on the chosen language 
        switch (choice) {
            case 'e':
                System.out.println("Hello, how are you?"); // English greeting
                break;
            case 's':
                System.out.println("Hola, ¿cómo estás?"); // Spanish greeting
                break;
            case 'f':
                System.out.println("Bonjour, comment ça va?"); // French greeting
                break;
            default:
                System.out.println("Sorry, I don't have a greeting in that language."); // Default message for unrecognized languages
        }
        scanner.close(); 
}
