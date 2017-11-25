
/**
 * Write a description of class SalariedEmployee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SalariedEmployee extends Employee
{
   private String theYearlySalary;
    
    /**
   * Constructs a new Employee object implemented from the Person Class
   *
   * @param fName the first name of the person
   * @param lName the last name of the person
   * @param gender the gender of the person
   * @param age the age of the person
   * @param address the address of the person
   * @param socialSecurity the social security of the person
   * @param telephoneNumber the telephone number of the person
   * @param departmentJob he department job
   * @param jobTitle the job title
   * @param yearOfHire the year of hire
   * @param yearlySalary the yearly salary
   */
   public SalariedEmployee (String fName, String lName, String gender, String age, String address,
                    String socialSecurityNumber, String telephoneNumber, String departmentJob,
                    String jobTitle, String yearOfHire, String yearlySalary)
   {
       super(fName, lName, gender, age, address, socialSecurityNumber, 
                telephoneNumber, departmentJob, jobTitle, yearOfHire);
       theYearlySalary = yearlySalary;
   }
   
   
   /**
   * @param yearly salary the salary of the person
   */
   public void setYearlySalary(String yearlySalary)
   {
       theYearlySalary = yearlySalary;
   }
   
   /**
   * @return yearly salary of the Person
   */
   public String getYearlySalary()
   {
       return theYearlySalary;
   }
   
   /**
     * @return String representation of SalariedEmployee object
     */
    public String toString()
    {
        System.out.println(super.toString());
        return String.valueOf(getYearlySalary());
    }
}
