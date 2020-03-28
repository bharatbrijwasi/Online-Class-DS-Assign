import java.util.Scanner;
class Node
{
	int data;
	Node next;

	public Node(int data)
	{
		this.data = data;
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

	public void addNode(int data)
	{
		Node newnode = new Node(data);
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

	public boolean checkNode(int fNode)
	{
		boolean found = false;
		if(head == null)
		{
			System.out.println("Not found...");
		}
		else
		{
			Node temp = head;
			while(temp != null)
			{
				if(temp.data == fNode) //fNode is the node that we search in linkedlist
				{
					found = true;
					break;
				}
				temp = temp.next;
			}
		}
		return found;
	}
}

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