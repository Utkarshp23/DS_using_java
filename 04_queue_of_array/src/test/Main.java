package test;

import java.util.Scanner;

import blueprint.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q= new Queue(5);
//		System.out.println(q.isEmpty());
//		q.enque(1);
//		q.enque(2);
//		q.enque(3);
//		q.enque(4);
//		q.enque(5);
//		q.enque(6);
//		System.out.println(q.getFront());
//		System.out.println(q.getRear());
//		System.out.println("Queue is:");
//		q.display();
//		
//		System.out.println("Dequed element is:"+q.deque());
//		System.out.println("Dequed element is:"+q.deque());
//		System.out.println("Dequed element is:"+q.deque());
//		System.out.println("Queue is:");
//		q.display();
		
		int ch=0;
		Scanner sc= new Scanner(System.in);
		while(ch!=4)
		{
			System.out.println("\n####################");
			System.out.println("1.Enque");
			System.out.println("2.Deque");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			System.out.println("--------------------");
			System.out.println(">Enter choice:");
			ch=sc.nextInt();
			System.out.println("####################");
			System.out.println();
			switch(ch)
			{
				case 1:
					int k;
					System.out.println("Enter element to enque:");
					k=sc.nextInt();
					q.enque(k);
					break;
					
				case 2:
					System.out.println("Dequed Element is:"+ q.deque());
					break;
					
				case 3:
					System.out.println("Queue is:");
					q.display();
					break;
					
				case 4:
					break;
				
			}
		}
		
		
	}

}
