import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String programmerName = "Adam";
        
        System.out.print("Enter your name: ");
        String userName = input.nextLine();
        
        if (userName.equals(programmerName)) {
            System.out.println("We have the same name!");
        
        } else {
            System.out.println("Your name is different from mine!");
        }
    }
}
