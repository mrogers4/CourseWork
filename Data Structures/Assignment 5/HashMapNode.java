
/**
 * Write a description of class HashMapNode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HashMapNode
{
    String theUsername; 
    String thePassword;
    HashMapNode theNextHashMapNode = null;
    
    public HashMapNode(String inUsername, String inPassword) {
        theUsername = inUsername;
        thePassword = inPassword;
        theNextHashMapNode = null;
    }
    
    
    public void setUsername(String inUsername)
    {
        theUsername = inUsername;
    }
    
    public void setPassword(String inPassword)
    {
        thePassword = inPassword;
    }
    
    public void setNextHashMapNode(HashMapNode inNextHashMapNode)
    {
        theNextHashMapNode = inNextHashMapNode;
    }
    
    public String getUsername()
    {
        return theUsername;
    }
    
    public String getPassword()
    {
       return thePassword;
    }
    
    public HashMapNode getNextHashMapNode()
    {
        return theNextHashMapNode;
    }
    
    
}
