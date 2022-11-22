package printReverse;

import linkedlist.List;
import node.Node;

public class Main {

	public static void printReverse(Node head)
	{
		if(head==null)
		{
			return;
		}
		printReverse(head.next);
		System.out.println(head.data);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new List();
		l.createLL(5);
		System.out.println("List before is:");
		l.displayList();
		
		System.out.println("Reversely printed list:");
		printReverse(l.head);
	}

}
