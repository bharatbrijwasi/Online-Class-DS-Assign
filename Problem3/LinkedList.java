class LinkedList
{
	Node head;
	public LinkedList()
	{
		head = null;
	}

	public void addNode()
	{
		Employee em = new Employee();
		Node newnode = new Node(em);
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

	public void searchEmployee(String searchEmployee)
	{
		if(head == null)
		{
			System.out.println("Empty List...");
		}

		else
		{
			Node temp = head;
			while(temp != null)
			{
				if(temp.em.getfName().equals(searchEmployee))
				{
					System.out.println("First_Name: " +temp.em.getfName());
					System.out.println("Last_Name: " +temp.em.getlName());
					System.out.println("Age: " +temp.em.getAge());
					System.out.println("DOB: " +temp.em.getDOB());
					System.out.println("Salary: " +temp.em.getSalary());
					break;
				}
				temp = temp.next;
			}
		}
	}
}
