package list;

public class CircularList {
	class Node{
		private int data;
		private Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	private Node head;
	public CircularList()
	{
		head=null;
	}
	
	public void insert(int data)
	{
		Node rec= new Node(data);
		if(head==null)
		{
			head=rec;
			head.next=head;
		}else {
			Node temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=rec;
			rec.next=head;
		}
	}
	
	public void deleteAtPos(int pos)
	{
		if(pos==1)
		{
			Node temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			Node toDel=head;
			temp.next=head.next;
			head=head.next;
			toDel=null;
		}else {
			Node temp=head;
			int cnt=1;
			while(cnt<pos-1)
			{
				cnt++;
				temp=temp.next;
			}
			Node toDel=temp.next;
			temp.next=temp.next.next;
		}
	}
	
	public void display()
	{
		Node temp=head;
		while(temp.next!=head)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
	
}
