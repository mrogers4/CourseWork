
/**
 * A program that simulates a deck of cards with some basic functionalities.
 * 
 * @author Mia Rogers 
 * @version October 23, 2016
 */
public class Main
{
    public static void main(String [] args)
    {
        DeckOfPlayingCards playingCards = new DeckOfPlayingCards();
        Card[] myHand; 
        System.out.println("Prints out the full deck of cards");
        playingCards.print(); //prints out all of the cards
        
        System.out.println("----------------------");
        
        System.out.println("Prints out the cards dealt out and the cards remaining before & after the cards are dealt");
        System.out.println("Number of cards remaing before are: " + playingCards.playingCardsRemaining());
        int numberOfCardsToDeal = 10;
        myHand = new Card[numberOfCardsToDeal];
        myHand = playingCards.deal(numberOfCardsToDeal);
        for (int i = 0; i < numberOfCardsToDeal; i++)
        {
            System.out.println(myHand[i]); //prints out the cards dealt out
        }
        //playingCards.deal(10); //same as the coding of the three lines above
        System.out.println("Number of cards remaing after are: " + playingCards.playingCardsRemaining());
        playingCards.print();
        
        System.out.println("-------------------------------------------");
        
        playingCards = new DeckOfPlayingCards(); //creates a brand new deck of playing cards
        System.out.println("New deck of cards printed out");
        playingCards.print();
        
        System.out.println("----------------------");
        
        playingCards.playingCardsShuffle();
        System.out.println("Prints out Deck of cards after shuffled");
        playingCards.print();
        
        System.out.println("----------------------");
        
        System.out.println("Prints out the cards dealt out and the cards remaining before & after the cards are dealt");
        System.out.println("Number of cards remaing before are: " + playingCards.playingCardsRemaining());
        numberOfCardsToDeal = 5;
        myHand = new Card[numberOfCardsToDeal];
        myHand = playingCards.deal(numberOfCardsToDeal);
        for (int i = 0; i < numberOfCardsToDeal; i++)
        {
            System.out.println(myHand[i]); //prints out the cards dealt out
        }
        System.out.println("Number of cards remaing are: " + playingCards.playingCardsRemaining());
    }
}
