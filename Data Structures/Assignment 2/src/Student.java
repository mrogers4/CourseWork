
public class Student 
{
/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
private String theFirstName;
private String theLastName;
private String theRegisteredCourse;
private String theStuentID;



/**
 * @param theFirstName
 * @param theLastName
 * @param theRegisteredCourse
 * @param theStuentID
 */
public Student(String theFirstName, String theLastName,
		String theRegisteredCourse, String theStuentID) 
{
	this.theFirstName = theFirstName;
	this.theLastName = theLastName;
	this.theRegisteredCourse = theRegisteredCourse;
	this.theStuentID = theStuentID;
}
/**
 * @return the theFirstName
 */
public String getTheFirstName() 
{
	return theFirstName;
}
/**
 * @param theFirstName the theFirstName to set
 */
public void setTheFirstName(String theFirstName) 
{
	this.theFirstName = theFirstName;
}
/**
 * @return the theLastName
 */
public String getTheLastName() 
{
	return theLastName;
}
/**
 * @param theLastName the theLastName to set
 */
public void setTheLastName(String theLastName) 
{
	this.theLastName = theLastName;
}
/**
 * @return the theRegisteredCourse
 */
public String getTheRegisteredCourse() 
{
	return theRegisteredCourse;
}
/**
 * @param theRegisteredCourse the theRegisteredCourse to set
 */
public void setTheRegisteredCourse(String theRegisteredCourse) 
{
	this.theRegisteredCourse = theRegisteredCourse;
}
/**
 * @return the theStuentID
 */
public String getTheStuentID() 
{
	return theStuentID;
}
/**
 * @param theStuentID the theStuentID to set
 */
public void setTheStuentID(String theStuentID) 
{
	this.theStuentID = theStuentID;
}

@Override
public String toString() 
{
	return "Student [theFirstName=" + theFirstName + ", theLastName="
			+ theLastName + ", theRegisteredCourse=" + theRegisteredCourse
			+ ", theStuentID=" + theStuentID + "]";
}

}
