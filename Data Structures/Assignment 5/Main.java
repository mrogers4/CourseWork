import java.io.*;
import java.util.Scanner;
/**
 * Write a description of class Main here.
 * 
 * @author Mia Rogers 
 * @version December 3, 2016
 */
public class Main
{
   public static void main(String [] args)
   {
    int theLogInHashTableSize = 10;
    LogInHashTable theLogInHashTable = new LogInHashTable(theLogInHashTableSize); 
       
    HashEntry newUser = new HashEntry("User1", "Pass1");
       try {
        /*PrintWriter theWriter = new PrintWriter("password.dat");
        theWriter.println("User1, Pass1");
        theWriter.println("User2, Pass2");
        theWriter.println("User3, Pass3");
        theWriter.println("User4, Pass4");
        theWriter.println("User5, Pass5");
        theWriter.println("User6, Pass6");
        theWriter.println("User7, Pass7");
        theWriter.println("User8, Pass8");
        theWriter.println("User9, Pass9");
        theWriter.println("User10, Pass10");
        theWriter.println("User11, Pass11");
        theWriter.close(); */
        
        Scanner theIn = new Scanner (new FileReader("password.dat"));
        theIn.useDelimiter(",|\n");
        String theString;
        
        while (theIn.hasNext()) {
            theString = theIn.next();
            newUser.setUsername(theString);
            theString = theIn.next();
            newUser.setPassword(theString);
            theLogInHashTable.put(newUser);
        }
        theLogInHashTable.print();
        
        Scanner sc = new Scanner(System.in);
        String name;
        String password;
        System.out.println("Enter your Name: ");
        name = sc.next();
        System.out.println("Enter your password: ");
        password = sc.next();
        theLogInHashTable.checkUser(new HashEntry(name, password));
        theLogInHashTable.authenticateUser(new HashEntry(name, password));
        
        
        
        
        
        
        /*if (theLogInHashTable.checkUser(newUser))
        {
            System.out.println("User exists");
            if (theLogInHashTable.authenticateUser(newUser))
            {
                System.out.println("User authenticated");
            }
            else
            {
                System.out.println("User not authenticated");
            }
        }
        else
        {
            System.out.println("User does not exist");
        }
       
        
        if (theLogInHashTable.checkUser(newUser))
        {
            System.out.println("User exists");
            newUser.setPassword("Pass99");
            if (theLogInHashTable.authenticateUser(newUser))
            {
                System.out.println("User authenticated");
            }
            else
            {
                System.out.println("User not authenticated");
            }
        }
        else
        {
            System.out.println("User does not exist");
        }
        
        newUser.setUsername("User99");
        if (theLogInHashTable.checkUser(newUser))
        {
            System.out.println("User exists");
            if (theLogInHashTable.authenticateUser(newUser))
            {
                System.out.println("User authenticated");
            }
            else
            {
                System.out.println("User not authenticated");
            }
        }
        else
        {
            System.out.println("User does not exist");
        }*/
        
        
        
        
        
        
    } 
        catch (IOException ex) {
        ex.printStackTrace();
        }
        
        
    
   }
  }

