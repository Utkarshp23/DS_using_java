package queue;

import java.util.Scanner;

//import node.Node;

public class Queue {

	class Node {
		private int data;
		private Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	private Node front,rear;

	public Queue() {
		front=rear = null;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public void enqueue(int elem) {
		Node rec = new Node(elem);

		if(!isEmpty())
		{
			rear.next=rec;
			rear=rec;
		}else {
			front=rear=rec;
		}

	}
	
	public int dequeue()
	{
		int d=-9999;
		if(!isEmpty())
		{
			d=front.data;
			Node del=front;
			front=front.next;
			del=null;
		}
		return d;
	}
	
	public void display()
	{
		Node temp=front;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}


	public int getSize() {
		Node temp = front;
		int cnt = 1;
		while (((temp = temp.next) != null) && (++cnt) > 0)
			;

		return cnt;
	}
}


