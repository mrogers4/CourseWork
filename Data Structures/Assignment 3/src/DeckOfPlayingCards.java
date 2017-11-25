import java.util.*;

/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeckOfPlayingCards
{
    private CardStack theDeckOfPlayingCards = new CardStack();
    
    public DeckOfPlayingCards()
    {
        for (Card.SuitEnum theCurrentSuit : Card.SuitEnum.values())//thecurrentsuit variable is of type suitEnum
        {
            for (Card.ValueEnum theCurrentValue : Card.ValueEnum.values())//thecurrentvalue variable is of type valueEnum
            {
                Card tempCard = new Card(theCurrentValue, theCurrentSuit);
                System.out.println(tempCard);
                
                //prints out each name of deck of the card
                theDeckOfPlayingCards.push(tempCard);
                //When printed, prints out true 
            }
        }
    }
    
    public Card[] deal(int numberOfCardsToDeal)
    {
        Card[] cardArray = new Card[numberOfCardsToDeal];
        for (int i = 0; i < numberOfCardsToDeal; i++) 
        {
            if(!theDeckOfPlayingCards.isEmpty())
            {
                cardArray [i] = theDeckOfPlayingCards.pop();
            }
            else
            {
                //TBD
            }
        }
        return cardArray;
    }
    
    public void print()
    {
        Card theCurrentCard;
        int index = 0;
        boolean hasMoreCards = false;
        hasMoreCards = !theDeckOfPlayingCards.isEmpty();
        while(hasMoreCards)
        {
            theCurrentCard = theDeckOfPlayingCards.peek(index);
            if(theCurrentCard == null)
            {
                hasMoreCards = false;
            }
            else
            {
                System.out.println(theCurrentCard);
                index++;
            }
        }
    }
    
    public void playingCardsShuffle()
    {
        theDeckOfPlayingCards.shuffle();
    }
    
    public int playingCardsRemaining()
    {
        return theDeckOfPlayingCards.cardsRemaining();
    }
}
