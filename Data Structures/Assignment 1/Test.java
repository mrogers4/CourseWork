import java.lang.System.*;
import java.util.Scanner;
/**
 * Class shows the class hierarchy, polymorphism and the function overriding.
 * 
 * @author Mia Rogers 
 * @version September 21, 2016
 */
public class Test
{
   public static void main(String [ ] args)
   {
       test1();
       //Shows a simple test of the object heirarchy, and the polymorphism funtion calls 
       test2();
       //Shows the array of the Person classes and all of it's descendant classes
       
       //Test3() not here, but would've expanded on test 2 & taking the strings from a file instead of from a code 
       
   
    }
   
   static void test1()
   {
       Person thePerson = new Person("Mia_1", "Rogers_1", "Female_1", "19_1", 
                    "1333 Tremont Street_1", "1234567899_1", "5088240924_1");
                    
       Student theStudent = new Student("Mia_2", "Rogers_2", "Female_2", "19_2", 
                    "1333 Tremont Street_2", "1234567899_2", "5088240924_2", 
                    "3.6_2", "Computer Science_2", "2019_2");
       
       Employee theEmployee = new Employee("Mia_3", "Rogers_3", "Female_3", "19_3", 
                    "1333 Tremont Street_3", "1234567899_3", "5088240924_3", 
                    "Burger King_3", "Cook_3", "2013_3"); 
                    
       HourlyEmployee theHourlyEmployee = new HourlyEmployee("Mia_4", "Rogers_4", "Female_4", "19_4", 
                    "1333 Tremont Street_4", "1234567899_4", "5088240924_4", 
                    "Burger King_4", "Cook_4", "2013_4", "40_4", "10.00_4");
                    
       SalariedEmployee theSalariedEmployee = new SalariedEmployee("Mia_5", "Rogers_5", "Female_5", "19_5", 
                    "1333 Tremont Street", "1234567899", "5088240924", 
                    "Burger King_5", "Cook_5", "2013_5", "20000_5");  
                    
       System.out.println("*** This is a person Object ***");             
       System.out.println(thePerson);  
       System.out.println("--------------------");
       System.out.println("*** This is a Student Object ***");
       System.out.println(theStudent);  
       System.out.println("--------------------");
       System.out.println("*** This is a Employee Object ***");
       System.out.println(theEmployee);  
       System.out.println("--------------------");
       System.out.println("*** This is a HourlyEmployee object ***");
       System.out.println(theHourlyEmployee);  
       System.out.println("--------------------");
       System.out.println("*** This is a SalariedEmployee Object ***");
       System.out.println(theSalariedEmployee);  
       System.out.println("--------------------");
   }
   
   static void test2()
   {
       Person[] personArray = new Person[15];
       Scanner s;
       String ts;
       ts = "Mia_1_1 -- Rogers_1_1 -- Female_1_1 -- 19_1_1 -- 1333 Tremont Street_1_1 -- 1234567899_1_1 -- 5088240924_1_1";
       s = new Scanner(ts).useDelimiter("\\s*--\\s*");
       personArray[0] = new Person(s.next(), s.next(), s.next(), s.next(), 
                    s.next(), s.next(), s.next());
                    
       ts = "Mia_1_2 -- Rogers_1_2 -- Female_1_2 -- 19_1_2 -- 1333 Tremont Street_1_2 -- 1234567899_1_2 -- 5088240924_1_2";
       s = new Scanner(ts).useDelimiter("\\s*--\\s*");
       personArray[1] = new Person(s.next(), s.next(), s.next(), s.next(), 
                    s.next(), s.next(), s.next());
                    
       ts = "Mia_1_3 -- Rogers_1_3 -- Female_1_3 -- 19_1_3 -- 1333 Tremont Street_1_3 -- 1234567899_1_3 -- 5088240924_1_3";
       s = new Scanner(ts).useDelimiter("\\s*--\\s*");
       personArray[2] = new Person(s.next(), s.next(), s.next(), s.next(), 
                    s.next(), s.next(), s.next());
                    
       
                    
       ts = "Mia_2_1 -- Rogers_2_1 -- Female_2_1 -- 19_2_1 -- 1333 Tremont Street_2_1 -- 1234567899_2_1 -- 5088240924_2_1 -- 3.6_2_1 -- Computer Science_2_1 -- 2019_2_1";
       s = new Scanner(ts).useDelimiter("\\s*--\\s*");
       personArray[3] = new Student(s.next(), s.next(), s.next(), s.next(), 
                    s.next(), s.next(), s.next(),s.next(), s.next(), s.next());
                    
       ts = "Mia_2_2 -- Rogers_2_2 -- Female_2_2 -- 19_2_2 -- 1333 Tremont Street_2_2 -- 1234567899_2_2 -- 5088240924_2_2 -- 3.6_2_2 -- Computer Science_2_2 -- 2019_2_2";
       s = new Scanner(ts).useDelimiter("\\s*--\\s*");
       personArray[4] = new Student(s.next(), s.next(), s.next(), s.next(), 
                    s.next(), s.next(), s.next(),s.next(), s.next(), s.next());
                    
       ts = "Mia_2_3 -- Rogers_2_3 -- Female_2_3 -- 19_2_3 -- 1333 Tremont Street_2_3 -- 1234567899_2_3 -- 5088240924_2_3 -- 3.6_2_3 -- Computer Science_2_3 -- 2019_2_3";
       s = new Scanner(ts).useDelimiter("\\s*--\\s*");
       personArray[5] = new Student(s.next(), s.next(), s.next(), s.next(), 
                    s.next(), s.next(), s.next(),s.next(), s.next(), s.next());            
                    
       
                    
       ts = "Mia_2_1 -- Rogers_3_1 -- Female_3_1 -- 19_3_1 -- 1333 Tremont Street_3_1 -- 1234567899_3_1 -- 5088240924_3_1 -- Burger King_3_1 -- Cook_3_1 -- 2013_3_1";
       s = new Scanner(ts).useDelimiter("\\s*--\\s*");
       personArray[6] = new Employee(s.next(), s.next(), s.next(), s.next(), 
                    s.next(), s.next(), s.next(),s.next(), s.next(), s.next());
                    
       ts = "Mia_3_2 -- Rogers_3_2 -- Female_3_2 -- 19_3_2 -- 1333 Tremont Street_3_2 -- 1234567899_3_2 -- 5088240924_3_2 -- Burger King_3_2 -- Cook_3_2 -- 2013_3_2";
       s = new Scanner(ts).useDelimiter("\\s*--\\s*");
       personArray[7] = new Employee(s.next(), s.next(), s.next(), s.next(), 
                    s.next(), s.next(), s.next(),s.next(), s.next(), s.next());
                    
       ts = "Mia_3_3 -- Rogers_3_3 -- Female_3_3 -- 19_3_3 -- 1333 Tremont Street_3_3 -- 1234567899_3_3 -- 5088240924_3_3 -- Burger King_3_3 -- Cook_3_3 -- 2013_3_3";
       s = new Scanner(ts).useDelimiter("\\s*--\\s*");
       personArray[8] = new Employee(s.next(), s.next(), s.next(), s.next(), 
                    s.next(), s.next(), s.next(),s.next(), s.next(), s.next());
       
                    
                    
       ts = "Mia_4_1 -- Rogers_4_1 -- Female_4_1 -- 19_4_1 -- 1333 Tremont Street_4_1 -- 1234567899_4_1 -- 5088240924_4_1 -- Burger King_4_1 -- Cook_4_1 -- 2013_3 -- 40_4_1 -- 10.00_4_1";
       s = new Scanner(ts).useDelimiter("\\s*--\\s*");
       personArray[9] = new HourlyEmployee(s.next(), s.next(), s.next(), s.next(), 
                    s.next(), s.next(), s.next(),s.next(), s.next(), s.next(), s.next(), s.next());
                    
       ts = "Mia_4_2 -- Rogers_4_2 -- Female_4_2 -- 19_4_2 -- 1333 Tremont Street_4_2 -- 1234567899_4_2 -- 5088240924_4_2 -- Burger King_4_2 -- Cook_4_2 -- 2013_4_2 -- 40_4_2 -- 10.00_4_2";
       s = new Scanner(ts).useDelimiter("\\s*--\\s*");
       personArray[10] = new HourlyEmployee(s.next(), s.next(), s.next(), s.next(), 
                    s.next(), s.next(), s.next(),s.next(), s.next(), s.next(), s.next(), s.next());
                    
       ts = "Mia_4_3 -- Rogers_4_3 -- Female_4_3 -- 19_4_3 -- 1333 Tremont Street_4_3 -- 1234567899_4_3 -- 5088240924_4_3 -- Burger King_4_3 -- Cook_4_3 -- 2013_3 -- 40_4_3 -- 10.00_4_3";
       s = new Scanner(ts).useDelimiter("\\s*--\\s*");
       personArray[11] = new HourlyEmployee(s.next(), s.next(), s.next(), s.next(), 
                    s.next(), s.next(), s.next(),s.next(), s.next(), s.next(), s.next(), s.next());
       
                    
                    
       ts = "Mia_5_1 -- Rogers_5_1 -- Female_5_1 -- 19_5_1 -- 1333 Tremont Street_5_1 -- 1234567899_5_1 -- 5088240924_5_1 -- Burger King_5_1 -- Cook_5_1 -- 2013_5_1 -- 20000_5_1";
       s = new Scanner(ts).useDelimiter("\\s*--\\s*");
       personArray[12] = new SalariedEmployee(s.next(), s.next(), s.next(), s.next(), 
                    s.next(), s.next(), s.next(),s.next(), s.next(), s.next(), s.next());
                    
       ts = "Mia_5_2 -- Rogers_5_2 -- Female_5_2 -- 19_5_2 -- 1333 Tremont Street_5_2 -- 1234567899_5_2 -- 5088240924_5_2 -- Burger King_5_2 -- Cook_5_2 -- 2013_5_2 -- 20000_5_2";
       s = new Scanner(ts).useDelimiter("\\s*--\\s*");
       personArray[13] = new SalariedEmployee(s.next(), s.next(), s.next(), s.next(), 
                    s.next(), s.next(), s.next(),s.next(), s.next(), s.next(), s.next());
                    
       ts = "Mia_5_3 -- Rogers_5_3 -- Female_5_3 -- 19_5_3 -- 1333 Tremont Street_5_3 -- 1234567899_5_3 -- 5088240924_5_3 -- Burger King_5_3 -- Cook_5_3 -- 2013_5_3 -- 20000_5_3";
       s = new Scanner(ts).useDelimiter("\\s*--\\s*");
       personArray[14] = new SalariedEmployee(s.next(), s.next(), s.next(), s.next(), 
                    s.next(), s.next(), s.next(),s.next(), s.next(), s.next(), s.next());
       
       
       for (int i = 0; i < personArray.length; i++)
       {
           System.out.println(personArray[i]);
           System.out.println();
       }
    
   }
   
}
