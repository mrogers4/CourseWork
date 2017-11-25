/**
 * 
 */

/**
 * @author Mia Rogers
 *
 */
public class MyLinkedList <Student> 
{
	
		private class Node 
		{
			private Student data;
			private Node next;
			private Node previous;
			public Node(Student s)
			{
				this.data = s;
				this.next = null;
			}
		}
	private Node head;
	private Node tail;
	
	public MyLinkedList() 
	{
		head = null;
	}
	
	public void add(Student s) 
	{
		if(head == null) 
		{
			head = new Node(s);
			//giving head information now, not just null
		}
		else //what if the head is not null, thats what the else statement is for
		{
			Node current = head;
			Node newNode = new Node(s);
				while(current.next != null)
				{
					current = current.next;
				}
				current.next = newNode;
		}
	}
	

	
	public void remove(Student s)
	{
		if(head == null)
		{
			head = new Node(s);
		}
		else
		{
			if(head == tail)
			{
				head = null;
				tail = null;
			}
			else
			{
				head = head.next;
			}
			
		}
	}
	
public void removeByName(String n)
{
		Node current = head;
		
	while (current != null)
	{
			String info = current.data.toString();
			
		if (info.indexOf(n) != -1)//
		{
			current.next = current.next.next;
				
		}
			
		current = current.next;
	}
}
	
	
		
		//Do something similar from above coding for the taking away information
		
		public void print(){
			Node current = head;
			System.out.println("--------------------------");
			while(current != null) 
			{
				System.out.println(current.data);
				current = current.next;
			}
	}
}
