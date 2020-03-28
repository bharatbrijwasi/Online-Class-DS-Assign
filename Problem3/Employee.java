import java.util.Scanner;
class Employee 
{
	private String fName;
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

	public String getfName()
	{
		return fName;
	}

	public String getlName()
	{
		return lName;
	}
	public int getAge()
	{
		return age;
	}
	public String getDOB()
	{
		return dob;
	}
	public double getSalary()
	{
		return salary;
	}
}
