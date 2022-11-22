package merge_Lists;

import linkedlist.List;

public class Main {

	public static void mergeLL(List l1, List l2)
	{
		l1.tail.next=l2.head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l1= new List();
		List l2= new List();
		
		System.out.println("Enter 1st list------>");
		l1.createLL(5);
		System.out.println("Enter 2nd list------>");
		l2.createLL(5);
		
		System.out.println("List 1 is:");
		l1.displayList();
		
		System.out.println("List 2 is:");
		l2.displayList();
		
		mergeLL(l1,l2);
		System.out.println("Merged list is:");
		l1.displayList();
	}

}
