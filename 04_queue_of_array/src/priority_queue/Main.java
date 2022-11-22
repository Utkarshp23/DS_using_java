package priority_queue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue q= new PriorityQueue(5);
		Element e;
		Scanner sc= new Scanner(System.in);
		
		while(!q.isFull())
		{
			System.out.println("Enter Element:");
			
			int d;
			System.out.print("     data: " );
			d=sc.nextInt();
			
			int p;
			System.out.print("     priority: ");
			p=sc.nextInt();
			e=new Element(d,p);
			q.enque(e);
		}
		
		
		System.out.println("\n__________________________");
		System.out.println("Priority Queue is: \n");
		q.display();
	}

}
