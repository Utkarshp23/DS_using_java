package doublyList;

//import node.Node_d;

public class DoublyList {

//	-->Node class
	class Node_d {

		private int data;
		private Node_d next;
		private Node_d prev;

		public Node_d(int d) {
			data = d;
			next = prev = null;
		}

	}

	private Node_d head;
	private Node_d tail;

	public DoublyList() {
		head = tail = null;
	}

	public void insertNode(int d) {
		Node_d rec = new Node_d(d);
		if (head == null) {
			head = rec;
			tail = rec;
		} else {
			Node_d temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = rec;
			rec.prev = temp;

			tail = rec;
		}
	}

	public void insertAtPos(int pos, int data) {
		
		if(pos==0 || pos==1)
		{
			Node_d rec=new Node_d(data);
			rec.next=head;
			head.prev=rec;
			head=rec;
		}
		else if(pos<=getSize())
		{
			int cnt=1;
			Node_d rec=new Node_d(data);
			Node_d temp=head;
			
			while(cnt<pos-1)
			{
				cnt++;
				temp=temp.next;
			}
			
			rec.next=temp.next;
			temp.next.prev=rec;
			temp.next=rec;
			rec.prev=temp;
		}
		else if(pos==getSize()+1)
		{
			insertNode(data);
		}
		else {
			System.out.println("Enter valid Position !!!");
		}
	}
	
	
//	-->Insert after or before Data:
	public void insertChoiceData(String ch,int od,int data)
	{
		Node_d temp=head;
		int pos=1;
		while(temp!=null && temp.data!=od)
		{
			pos++;
			temp=temp.next;
		}
		
		if(temp!=null && pos>=1 && pos<=getSize())
		{
			if(ch.equals("after"))
			{
				
				insertAtPos(pos+1,data);
				
				
			}else if(ch.equals("before"))
			{
				insertAtPos(pos,data);
			}
			
		}
		else {
			System.out.println("Enter valid data");
		}
		
	}
	
// --> Delete node
	
	public void deleteAtPos(int pos)
	{
		Node_d toDelete;
		if(pos==1)
		{
			toDelete=head;
			head=head.next;
			toDelete=null;
		}else if(pos<getSize())
		{
			Node_d temp=head;
			while((--pos)>1)
			{
				temp=temp.next;
			}
			
			toDelete=temp.next;
			if(temp.next.next!=null)
			  temp.next=temp.next.next;
			else {
				temp.next=null;
			}
		}
	
	}

	
	public int getSize()
	{
		Node_d temp= head;
		int cnt=0;
		while(temp!=null)
		{
			cnt++;
			temp=temp.next;
		}
		return cnt;
	}
	
	public void displayDll() {
		Node_d temp = head;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

	public void displayR() {
		Node_d temp = tail;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.prev;
		}
	}
}

//while(me!=(SDE@GOOGLE))
//{
//	try {
//		
//		throw new Efforts()
//		throw consistency()
//	}
//	catch(Failures f | Rejections r)
//	{
//		
//	}
//	
//}
