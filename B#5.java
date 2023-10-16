import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner to read user input
        System.out.print("Enter your choice (rock, paper, scissors): "); // Prompt the user to enter their choice
        String player1 = scanner.next(); // Read the first player's choice
        String player2 = scanner.next(); // Read the second player's choice

        if (player1.equals(player2)) {
            System.out.println("It's a tie!"); // If both players choose the same, it's a tie
        } else if ((player1.equals("rock") && player2.equals("scissors")) || 
                   (player1.equals("paper") && player2.equals("rock")) || 
                   (player1.equals("scissors") && player2.equals("paper"))) {
            System.out.println("Player 1 wins!"); // Determine the winner based on the game rules
        } else {
            System.out.println("Player 2 wins!"); // If it's not a tie and Player 1 didn't win, Player 2 wins
        }
        scanner.close(); 
    }
}
