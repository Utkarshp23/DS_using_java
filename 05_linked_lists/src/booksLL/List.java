package booksLL;

import java.util.Scanner;


public class List {
	
	public Node head;
	public Node tail;
	
	public List()
	{
		head=tail=null;
	}
	
	
//	#####
//	Insert at end using 
//	Using tail---->
	
//	public void insertNode(int d)
//	{
//		Node rec=new Node(d);
//		
//		if(head==null)
//		{
//			head=rec;
//			tail=rec;
//		}
//		else {
//			tail.next=rec;
//			tail=rec;
//		}
//	}
	
	
//	Insert at end
	
	public void insertNode(Book d)
	{
		Node rec=new Node(d);
		
		if(head==null)
		{
			head=rec;
			tail=rec;
		}
		else {
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
			
			temp.next=rec;
			
			tail=rec;
		}
	}
	
//	Insert at given Position
	public void insertAtPos(int pos,Book d)
	{
		Node rec= new Node(d);
		if(pos==0 || pos==1)
		{
			rec.next=head;
			head=rec;
		}
		else if(pos==getSize()+1)
		{
			insertNode(d);
		}
		else if(pos>1 && pos<=getSize())
		{
			int cnt=1;
			Node temp=head;
			
			while(cnt<pos-1)
			{
				cnt++;
				temp=temp.next;
			}
			rec.next=temp.next;
			temp.next=rec;
		}
		else {
			System.out.println("Enter valid position!!");
		}
		
	}
	
//	Delete node at given position
	
	public void deleteAtPos(int pos)
	{
		Node toFree;
		if(pos==1)
		{
			toFree=head;
			head=head.next;
		}
		else if(pos<=getSize())
		{
			int cnt=1;
			Node temp=head;
			
			while((cnt++)<pos-1)
			{
				
				temp=temp.next;
			}
			toFree=temp.next;
			temp.next=temp.next.next;
		}else 
		{
			System.out.println("Enter valid Position !!");
		}
	}
	
	
//	Get size of Linked List
	
	public int getSize()
	{
		Node temp=head;
		int cnt=1;
		while(((temp=temp.next)!=null) && (++cnt)>0);
		
		return cnt;
	}
	
//	Create a List of Given size
	public void createLL(int non)
	{
		
		Scanner sc= new Scanner(System.in);
	    int cnt=1;
		while((non--)>0)
		{
			Book b;
			System.out.println("Enter "+cnt+"th Book title & price: ");
			b=new Book(sc.next(),sc.nextDouble());
			insertNode(b);
			cnt++;
		}
	}
	
	
//	---> Display Method
	
	public void displayList()
	{
		if(head!=null)
		{
			Node temp=head;
			
			while(temp!=null)
			{
				System.out.println(temp.data+" ");
				temp=temp.next;
			}
		}
		else {
			System.out.println("List is Empty");
		}
		
	}

}
