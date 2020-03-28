import java.util.Scanner;
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
			System.out.println("---------+-----------\n" +i+ " Employee details \n----------+----------");
			obj.addNode();
		}

		System.out.print("Search Employee by First Name: ");
		String sName = sc.next();
		obj.searchEmployee(sName);
	}
}