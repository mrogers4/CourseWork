
/**
 * Write a description of class HashEntry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HashEntry {
    String theUsername; 
    String thePassword;
    
    public HashEntry(String inUsername, String inPassword){
        theUsername = inUsername;
        thePassword = inPassword;
    }
    
    public void setUsername(String inUsername)
    {
        theUsername = inUsername;
    }
    
    public void setPassword(String inPassword)
    {
        thePassword = inPassword;
    }
    
    public String getUsername()
    {
        return theUsername;
    }
    
    public String getPassword()
    {
       return thePassword;
    }
    
    
}
