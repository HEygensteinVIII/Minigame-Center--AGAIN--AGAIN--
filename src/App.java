import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome to the Game Center (again (again)). Please enter the game choice you desire. (1 or 2) \n"
                + "1. Blackjack \n"
                + "2. Minecraft Guesser");
        int userChoice = scanner.nextInt();
        if (userChoice == 1) {
            System.out.println("'Blackjack' chosen. Wise, I must say");
        }
        if (userChoice == 2) {
            System.out.println("'Minecraft Guesser' chosen. Trivial, I see.");
        }
        if (userChoice == 69){ //69 is placeholder for special code given in minigames
            System.out.print("Secret passage enabled.");
        } 
        scanner.close();
    }
}
