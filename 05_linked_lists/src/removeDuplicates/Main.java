package removeDuplicates;



import linkedlist.List;
import node.Node;

public class Main {

	public static void removeDuplicates(List l)
	{
		Node temp=l.head;
		
		while(temp.next!=null)
		{
			if(temp.data==temp.next.data) {
				temp.next=temp.next.next;
				continue;
			}
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new List();
		l.createLL(5);
		System.out.println("List before is:");
		l.displayList();
		removeDuplicates(l);
		System.out.println("List is:");
		l.displayList();
	}

}
