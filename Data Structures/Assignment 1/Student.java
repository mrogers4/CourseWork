
/**
 * Abstract class Student - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class Student extends Person
{
   private String theGPA;
   private String theMajor;
   private String theYearOfGraduation;
   
   /**
     * Constructs a new Student object implemented from the Person Class
     *
     * @param fName the first name of the person
     * @param lName the last name of the person
     * @param gender the gender of the person
     * @param age the age of the person
     * @param address the Adress of the person
     * @param socialSecurity the social security of the person
     * @param telephoneNumber the telephone number of the person
     * @param gpa the gpa
     * @param major the major
     * @param yearOfGraduation the year of graduation
     */
   public Student (String fName, String lName, String gender, String age, String address, 
                    String socialSecurityNumber, String telephoneNumber, String gpa, 
                        String major, String yearOfGraduation)
   {
       super(fName, lName, gender, age, address, socialSecurityNumber, telephoneNumber);
       theGPA = gpa;
       theMajor = major;
       theYearOfGraduation = yearOfGraduation;
   }
   
   /**
    * @param gpa the gpa of the student
    */
   public void setGPA(String gpa)
   {
       theGPA = gpa;
   }
   
   /**
    * @param major the major of the student
    */
   public void setMajor(String major)
   {
       theMajor = major;
   }
   
   /**
    * @param yearOfGraduation the year of graduation of the student
    */
   public void setYearOfGraduation(String yearOfGraduation)
   {
       theYearOfGraduation = yearOfGraduation;
   }
   
   /**
     * @return the gpa of the student
     */
   public String getGPA()
   {
       return theGPA;
   }
   
   /**
     * @return the gpa of the student
     */
   public String getMajor()
   {
       return theMajor;
   }
   
   /**
     * @return year of graduation of the student
     */
   public String getYearOfGraduation()
   {
       return theYearOfGraduation;
   }
   
   /**
     * @return String representation of Student object
     */
    public String toString()
    {
        System.out.println(super.toString());
        return getGPA() + " " + getMajor() + " " + getYearOfGraduation();
    }
}
