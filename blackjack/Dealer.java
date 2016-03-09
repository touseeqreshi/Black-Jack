package blackjack;

public class Dealer  
{
    static int dealerTotal;

    public static void displayDealer() throws InterruptedException 
    {

        System.out.println("The secretcard that the dealer had was: ");
        Deck.getCardfromDeck("Dealer");
        System.out.println("\nTheir total is now: " + dealerTotal);
        Thread.sleep(800);


        // The dealer should hit when his score is <17
        while (dealerTotal < 17) 
        {
            Thread.sleep(800);
            System.out.println("The dealer gets a new card: ");
            Deck.getCardfromDeck("Dealer");
            System.out.println("\n Their total is now " + dealerTotal);
        }
        if (dealerTotal > 21) 
        {
            Thread.sleep(800);
            System.out.println("Total is over 21, and dealer lost, you won! Their total was "
                    + dealerTotal);
            System.exit(1);
        }
        else if (dealerTotal >= 17) 
        {
            Thread.sleep(800);
            System.out.println("Okay, dealer stopped at " + dealerTotal);
            Winner.displayWinner();
        }
    }
}