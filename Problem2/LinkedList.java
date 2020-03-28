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
