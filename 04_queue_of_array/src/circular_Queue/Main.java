package circular_Queue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularQueue q= new CircularQueue(5);
		Scanner sc=new Scanner(System.in);
		while(!(q.isFull()))
		{
			System.out.println("Enter element:");
			q.enque(sc.nextInt());
//			System.out.println("f: "+q.getFront()+" r: "+q.getRear());
		}
		System.out.println("Circular Queue is :");
		q.display();
		
		System.out.println("Dequed Elem: "+q.dequeue());
		System.out.println("Circular Queue is :");
		q.display();
		
		q.enque(6);
		System.out.println("Circular Queue is :");
		q.display();
		q.enque(7);
		
		
		
		while(!q.isEmpty())
		{
			System.out.println("Dequed Elem: "+q.dequeue());
			System.out.println("Circular Queue is :");
			q.display();
		}
	}

}
