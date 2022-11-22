package doublyList;

import node.Node_d;

public class DoublyList {

	private Node_d head;
	private Node_d tail;
	
	public DoublyList()
	{
		head=tail=null;
	}
	
	public void insertNode(int d)
	{
		Node_d rec= new Node_d(d);
		if(head==null)
		{
			head=rec;
			tail=rec;
		}else
		{
			Node_d temp= head;
			while(temp.getNext()!=null)
			{
				temp=temp.getNext();
			}
			temp.setNext(rec);
			
			tail=rec;
		}
	}
	
	public void displayDll()
	{
		Node_d temp= head;
		
		while(temp!=null)
		{
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
		
		
	}
	
	public void displayR()
	{
		Node_d temp= tail;
		
//		while()
	}
}
