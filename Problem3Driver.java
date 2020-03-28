import java.util.Scanner;
class Employee 
{
	String fName;
	private String lName;
	private int age;
	private String dob;
	private double salary;
 
 	public Employee()
 	{
 		fName = null;
 		lName = null;
 		age = 0;
 		dob = null;
 		salary = 0.0;
 	}

	Scanner sc = new Scanner(System.in);
	public void setDetails()
	{
		System.out.print("Enter First_Name: ");
		fName = sc.nextLine();
		System.out.print("Enter Last_Name: ");
		lName = sc.nextLine();
		System.out.print("Enter Age: ");
		age = sc.nextInt();
		System.out.print("Enter DOB: ");
		dob = sc.next();
		System.out.print("Enter Salary: ");
		salary = sc.nextDouble();
	}		
}

class Node
{
	Employee obj;
	Node next;

	public Node()
	{
		next = null;
	}
}

class LinkedList
{
	Node head;
	public LinkedList()
	{
		head = null;
	}

	public void addNode()
	{
		Node newnode = new Node();
		Employee em = new Employee();
		em.setDetails();
		
		if(head == null)
		{
			head = newnode;
		}
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newnode;
		}
	}

	public void searchEmployee()
	{
		if(head == null)
		{
			System.out.println("Employee not found...");
		}

		else
		{
			Node temp = head;
			while(temp != null)
			{
				System.out.println(temp.obj.fName);
				temp = temp.next;
			}
		}
	}
}

class Problem3Driver
{
	public static void main(String[] args)
	{
		LinkedList obj = new LinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Employee: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			System.out.println("---------+-----------" +i+ " Employee details \n----------+----------");
			obj.addNode();
		}

		obj.searchEmployee();
	}
}