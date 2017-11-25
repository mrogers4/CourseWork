/**
 * 
 */

/**
 * @author mia
 *
 */
public class Test 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Student s = new Student("Mia", "Rogers",
				"Data Structures", "061353");
		Student s2 = new Student("Mitch", "Cupp",
				"Data Structures", "059891");
		Student s3 = new Student("Carlos", "Nieves",
				"Data Structures", "054876");
		Student s4 = new Student("Emily", "Bumpus",
				"Data Structures", "098365");
		Student s5 = new Student("Rob", "Davis",
				"Data Structures", "089739");
		Student s6 = new Student("Benjamin", "Anderson",
				"Data Structures", "049828");
		
		MyLinkedList<Student> list = new MyLinkedList<Student>();
		//creating an object called linked list, and its type is MyLinkedlist
		
		list.add(s);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.print();
		list.remove(s);
		list.print();
		list.removeByName("Mitch");
		list.print();

	}
}



