import java.util.*;
/**
 * Write a description of class Stack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardStack
{
   //Card theCard = new Card(Card.Rank.ACE,Card.Suit.CLUBS); simple assignment
   private List<Card> theCardStack = new ArrayList<Card>();
   
   public boolean push(Card inCard)//adds new element to the top
   { 
     return theCardStack.add(inCard);
   }
   
   public Card pop()//retrieves top element
   {
      if (!theCardStack.isEmpty())
      {
          return theCardStack.remove(0);
      }
      else
      {
          return null; //to be done(TBD) handle this variable/error
      }
   }
   
   public Card peek() //inspects top element
   {
       if (!theCardStack.isEmpty())
      {
          return theCardStack.get(0);
      }
      else
      {
          return null; //to be done(TBD) handle this variable/error
      }
   }
   
   public Card peek(int theIndexToPeekAt) //inspects top element
   {
      //System.out.println(theCardStack.size());
      //theCardStack.pop();
      //System.out.println(theCardStack.size());
      
      if (theCardStack.size() > theIndexToPeekAt)
      {
          return theCardStack.get(theIndexToPeekAt);
      }
      else
      {
          return null; //to be done(TBD) handle this variable/error
      }
   }
   
   public boolean isEmpty()
   {
          return theCardStack.isEmpty();//returns true if empty
   }
   
   public void shuffle()
   {
       Collections.shuffle(theCardStack);
   }
   
   public int cardsRemaining()
   {
       return theCardStack.size();
   }
}
