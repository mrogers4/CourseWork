import java.util.*;
/**
 * Write a description of class Cards here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card
{
  public enum ValueEnum 
  { Two, Three, Four, Five, Six,
        Seven, Eight, Nine, Ten, Jack, Queen, King, Ace }

  public enum SuitEnum 
  { Clubs, Diamonds, Hearts, Spades }

    private final ValueEnum theValue;
    private final SuitEnum theSuit; //makes the value of the cards final, no changes
    public Card(ValueEnum inValue, SuitEnum inSuit) 
    {
        theValue = inValue;
        theSuit  = inSuit;
    }

    public ValueEnum getValue() 
    { 
        return theValue; 
    }
    
    public SuitEnum getSuit() 
    { 
        return theSuit; 
    }
    
    public String toString() 
    {
        return theValue + " of " + theSuit; 
    }

   
}
