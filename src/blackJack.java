import java.util.Scanner;

public class blackJack {
    Scanner input = new Scanner(System.in);
    private int playerTotal;
    private int dealerTotal;

    public int drawCard() {
        return (int)(Math.random() * 10) + 1; // Draws a card between 1 and 10
    }

    public String playGame() {
        playerTotal = 0;
        dealerTotal = 0;

        while (true) {
            String choice = playerEval();
            if (choice.equalsIgnoreCase("stand")) {
                break;
            }
        }

        return overallEval();
    }

    public String playerEval() {
        playerTotal += drawCard();
        dealerTotal += drawCard();
        System.out.print("Dealer currently has a value of " + dealerTotal + ". ");
        System.out.print("You currently have a value of " + playerTotal + ". Will you hit or stand? ('hit' or 'stand') ");
        return input.nextLine();
    }

    public boolean outcomePlayerEval() {
        return playerTotal > 21;
    }

    public boolean outcomeDealerEval() {
        return dealerTotal > 21;
    }

    public String overallEval() {
        if (outcomePlayerEval()) {
            return "You busted. Dealer had " + dealerTotal + " while you had " + playerTotal + ".";
        }
        if (outcomeDealerEval()) {
            return "Dealer busted. Dealer had " + dealerTotal + " while you had " + playerTotal + ".";
        }
        if (playerTotal > dealerTotal) {
            return "You won. Dealer had " + dealerTotal + " while you had " + playerTotal + ".";
        }
        if (dealerTotal > playerTotal) {
            return "You lost. Dealer had " + dealerTotal + " while you had " + playerTotal + ".";
        }
        return "It's a tie. Dealer had " + dealerTotal + " while you had " + playerTotal + ".";
    }
}