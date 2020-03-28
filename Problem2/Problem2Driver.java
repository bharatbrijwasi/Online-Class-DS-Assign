import java.util.Scanner;
class Problem2Driver
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList obj = new LinkedList();
		System.out.print("Nodes to be inserted: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			System.out.print(+i +" Node Value: ");
			obj.addNode(sc.nextInt());
		}

		System.out.print("Nodes to Searched: ");
		if(obj.checkNode(sc.nextInt()) == true)
		{
			System.out.println("Node found...");
		}
		else
		{
			System.out.println("Node Not found...");
		}
	}
}