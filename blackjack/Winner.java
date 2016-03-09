package blackjack;

public class Winner extends Player
{
    public static void displayWinner()
    {

        if(playerTotal > dealerTotal)
        {
            System.out.println("The Player won! The players score was " + playerTotal + ", and the dealers score was " + dealerTotal);
        }
        else if(playerTotal <= dealerTotal)
        {
            System.out.println("The Dealer won! The players score was " + playerTotal + ", and the dealers score was " + dealerTotal);
        }
    }
}
