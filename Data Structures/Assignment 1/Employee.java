
/**
 * Write a description of class Employee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Employee extends Person
{
    private String theDepartmentJob;
    private String theJobTitle;
    private String theYearOfHire;
    
    /**
     * Constructs a new Employee object implemented from the Person Class
     *
     * @param fName the first name of the person
     * @param lName the last name of the person
     * @param gender the gender of the person
     * @param age the age of the person
     * @param address the Adress of the person
     * @param socialSecurity the social security of the person
     * @param telephoneNumber the telephone number of the person
     * @param departmentJob he department job
     * @param jobTitle the job title
     * @param yearOfHire the year of hire
     */
   public Employee (String fName, String lName, String gender, String age, String address, 
                    String socialSecurityNumber, String telephoneNumber, String departmentJob,
                    String jobTitle, String yearOfHire)
   {
       super(fName, lName, gender, age, address, socialSecurityNumber, telephoneNumber);
       theDepartmentJob = departmentJob;
       theJobTitle = jobTitle;
       theYearOfHire = yearOfHire;
   }
   
   /**
    * @param departmentJob the department job of the employee
    */
   public void setDepartmentJob(String departmentJob)
   {
       theDepartmentJob = departmentJob;
   }
   
   /**
    * @param joTitle the job title of the employee
    */
   public void setJobTitle(String jobTitle)
   {
       theJobTitle = jobTitle;
   }
   
   /**
    * @param yearOfHire the year of hire of the employee
    */
   public void setYearOfHire(String yearOfHire)
   {
       theYearOfHire = yearOfHire;
   }
   
   /**
    * @return the department job of the employee
    */
   public String getDepartmentJob()
   {
       return theDepartmentJob;
   }
   
   /**
    * @return the job title of the employee
    */
   public String getJobTitle()
   {
       return theJobTitle;
   }
   
   /**
    * @return the year of hire of the employee
    */
   public String getYearOfHire()
   {
       return theYearOfHire;
   }
   
   /**
     * @return String representation of Employee object
     */
    public String toString()
    {
        System.out.println(super.toString());
        return getDepartmentJob() + " " + getJobTitle() + " " + getYearOfHire();
    }
}
