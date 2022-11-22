package splitListInEvenOdd;

import linkedlist.List;
import node.Node;

public class Main {

	public static List[] splitLL(List l)
	{
		List even =new List();
		List odd= new List();
		
		Node temp=l.head;
		
		while(temp!=null)
		{
			if(temp.data%2==0)
			{
				even.insertNode(temp.data);
			}
			else {
				odd.insertNode(temp.data);
			}
			temp=temp.next;
		}
		List [] arr= {even,odd};
		
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1= new List();
		System.out.println("Enter  list------>");
		l1.createLL(10);
		
		List []arr=splitLL(l1);
		
		System.out.println("Even List is:");
		arr[0].displayList();
		
		System.out.println("Odd List is:");
		arr[1].displayList();
		
	}

}
