
/**
 * Write a description of class HourlyEmployee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HourlyEmployee extends Employee
{
   private String theHoursWorked;
   private String theHourlyRate;
    
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
   * @param hoursWorked the hours worked
   * @param hourlyRate the hourly rate
   */
   public HourlyEmployee (String fName, String lName, String gender, String age, String address,
                    String socialSecurityNumber, String telephoneNumber, String departmentJob,
                    String jobTitle, String yearOfHire, String hoursWorked, String hourlyRate)
   {
       super(fName, lName, gender, age, address, socialSecurityNumber, 
                telephoneNumber, departmentJob, jobTitle, yearOfHire);
       theHoursWorked = hoursWorked;
       theHourlyRate = hourlyRate;
   }
   
   /**
    * @param hoursWorked the hours worked of the hourly employee
    */
   public void setHoursWorked(String hoursWorked)
   {
       theHoursWorked = hoursWorked;
   }
   
   /**
    * @param hourlyRate the hoursly rate of the hourly employee
    */
   public void setHourlyRate(String hourlyRate)
   {
       theHourlyRate = hourlyRate;
   }
   
   /**
    * @return the hours worked of the hourly employee
    */
   public String getHoursWorked()
   {
       return theHoursWorked;
   }
   
   /**
    * @return the hourly rate of the hourly employee
    */
   public String getHourlyRate()
   {
       return theHourlyRate;
   }
   
   /**
     * @return String representation of HourlyEmployee object
     */
    public String toString()
    {
        System.out.println(super.toString());
        return getHoursWorked() + " " + getHourlyRate();
    }
}
