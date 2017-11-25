
/**
 * Write a description of class LogInHashTable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LogInHashTable {
   int theSize;
   HashMapNode theHashTable []; //Declared an array of objects of type HashMapNode
    
   public LogInHashTable(int inSize) {
       theSize      = inSize; 
       theHashTable = new HashMapNode[inSize]; //initializes a size and creates a table 
        
        
   }
   
   private int calcHashCode(String key) {
    int mod = key.hashCode() % theSize;
    return mod < 0 ? mod + theSize : mod;
   }
   
   public boolean checkUser(HashEntry inHashEntry) {
       HashMapNode theCandidateNode = null;
       boolean keepSearching = true;
       boolean result = false;
       int theHashTableIndex = 0;
       
       theHashTableIndex = this.calcHashCode(inHashEntry.getUsername());
       theCandidateNode = theHashTable [theHashTableIndex];
       while (keepSearching)
       {
           //theCandidateNode = theHashTable [theHashTableIndex];
           if (theCandidateNode == null)
           {
               keepSearching = false;
               result = false;
               System.out.println("User " + inHashEntry.getUsername() + " not found");
           }
           else
           {
               if (theCandidateNode.getUsername() == inHashEntry.getUsername())
               {
                   keepSearching = false;
                   result = true;
                   //inHashEntry.setPassword(theCandidateNode.getPassword());
               }
               else
               {
                   theCandidateNode = theCandidateNode.getNextHashMapNode();
               }
           }
       }
       return result;
   }
   
   public boolean authenticateUser(HashEntry inHashEntry) {
       HashMapNode theCandidateNode = null;
       boolean keepSearching = true;
       boolean result = false;
       int theHashTableIndex = 0;
       
       theHashTableIndex = this.calcHashCode(inHashEntry.getUsername());
       theCandidateNode = theHashTable [theHashTableIndex];
       while (keepSearching)
       {
           //theCandidateNode = theHashTable [theHashTableIndex];
           if (theCandidateNode == null)
           {
               keepSearching = false;
               result = false;
               System.out.println("Authentification Failure");
           }
           else
           {
               if (theCandidateNode.getUsername() == inHashEntry.getUsername())
               {
                   keepSearching = false;
                   if (inHashEntry.getPassword() == theCandidateNode.getPassword())
                   {
                       result = true;
                       System.out.println("Authentification Success");
                   }
                   else
                   {
                       result = false;
                   }
                   //inHashEntry.setPassword(theCandidateNode.getPassword());
               }
               else
               {
                   theCandidateNode = theCandidateNode.getNextHashMapNode();
               }
           }
       }
       return result;
   }
   
   public void put(HashEntry inHashEntry) {
       HashMapNode theNewNode = null;
       int theHashTableIndex = 0;
       
       theHashTableIndex = this.calcHashCode(inHashEntry.getUsername());
       theNewNode = new HashMapNode(inHashEntry.getUsername(), inHashEntry.getPassword());
       //theNewNode.setNextMapHashNode(null);
       if (theHashTable[theHashTableIndex] == null)
       {
           theHashTable[theHashTableIndex] = theNewNode;
       }
       else
       {
           HashMapNode theCurrentFirstNode = theHashTable[theHashTableIndex];
           theNewNode.setNextHashMapNode(theCurrentFirstNode);
           theHashTable[theHashTableIndex] = theNewNode;
       }
   }
   
   /*public void remove(HashEntry inHashEntry) {
       
   }*/
   
   public void print()
   {
       HashMapNode theCurrentNode = null;
       for (int i = 0; i < theSize; i++)
       {
           theCurrentNode = theHashTable[i];
           if (theCurrentNode == null)
           {
               System.out.println("Cell " + i + " is empty");
           }
           else
           {
               System.out.println("Cell " + i + " is not empty");
               while (theCurrentNode != null)
               {
                   System.out.println("Username is " + theCurrentNode.getUsername());
                   System.out.println("Password is " + theCurrentNode.getPassword());
                   System.out.println();
                   theCurrentNode = theCurrentNode.getNextHashMapNode();
               }
               
               
           }
       }
   }
   
}
