
/**
 * Write a description of interface Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    private String theFirstName;
    private String theLastName;
    private String theGender;
    private String theAge;
    private String theAddress;
    private String theSocialSecurityNumber;
    private String theTelephoneNumber;
    
    /**
     * Constructs a new Person object.
     *
     * @param fName the first name of the person
     * @param lName the last name of the person
     * @param gender the gender of the person
     * @param age the age of the person
     * @param address the Adress of the person
     * @param socialSecurity the social security of the person
     * @param telephoneNumber the telephone number of the person
     */
    public Person(String fName, String lName, String gender, String age, String address, 
                    String socialSecurityNumber, String telephoneNumber) 
    {
		theFirstName = fName;
		theLastName = lName;
		theGender = gender;
		theAge = age;
		theAddress = address;
		theSocialSecurityNumber = socialSecurityNumber;
		theTelephoneNumber = telephoneNumber;
	}
    
    /**
    * @param fName first name of the Person
    */
    public void setFirstName(String fName)
    {
        theFirstName = fName;
    }
    
    /**
    * @param lName last name of the Person
    */
    public void setLastName(String lName)
    {
        theLastName = lName;
    }
    
    /**
    * @param gender the gender of the person
    */
    public void setGender(String gender)
    {
        theGender = gender;
    }
    
    /**
    * @param age the age of the person
    */
    public void setAge(String age)
    {
        theAge = age;
    }
    
    /**
    * @param address the address of the person
    */
    public void setAddress(String address)
    {
        theAddress = address;
    }
    
    /**
    * @param socialSecurityNumber the social security number of the person
    */
    public void setSocialSecurityNumber(String socialSecurityNumber)
    {
        theSocialSecurityNumber = socialSecurityNumber;
    }
    
    /**
    * @param telephoneNumber the telephone number
    */
    public void setTelephoneNumber(String telephoneNumber)
    {
        theTelephoneNumber = telephoneNumber;
    }
    
    /**
     * @return first name of the Person
     */
    public String getFirstName()
    {
        return theFirstName;
    }
    
    /**
     * @return last name of the Person
     */
    public String getLastName()
    {
        return theLastName;
    }
    
    /**
    * @return gender of the person
    */
    public String getGender()
    {
        return theGender;
    }
    
    /**
    * @return the age of the person
    */
    public String getAge()
    {
        return theAge;
    }
    
    /**
    * @return the address of the person
    */
    public String getAddress()
    {
        return theAddress;
    }
    
    /**
    * @return the social security number of the person
    */
    public String getSocialSecurityNumber()
    {
        return theSocialSecurityNumber;
    }
    
    /**
    * @return the telephone number of the person 
    */
    public String getTelephoneNumber()
    {
        return theTelephoneNumber;
    }
    
    /**
     * @return String representation of Person object
     */
    public String toString()
    {
        return getFirstName() + " " + getLastName() + " " 
        + getGender() + " " + getAge() + " " + getAddress() 
        + " " + getSocialSecurityNumber() + " " + getTelephoneNumber();
    }
}
