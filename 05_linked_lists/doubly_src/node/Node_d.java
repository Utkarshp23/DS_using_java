package node;

public class Node_d {
	
	private int data;
	private Node_d next;
	private Node_d prev;
	
	public Node_d(int d)
	{
		data=d;
		next=prev=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node_d getNext() {
		return next;
	}

	public void setNext(Node_d next) {
		this.next = next;
	}

	public Node_d getPrev() {
		return prev;
	}

	public void setPrev(Node_d prev) {
		this.prev = prev;
	}
}
