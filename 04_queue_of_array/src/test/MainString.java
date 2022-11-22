package test;

import java.util.Scanner;

import blueprint.StringQueue;

public class MainString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringQueue str= new StringQueue(5);
		
		System.out.println("enter 5 strings:");
		Scanner sc= new Scanner(System.in);
		
		while(!(str.isFull()))
		{
	       str.enque(sc.next());
		}
		
		
		System.out.println("Queue is:");
		str.display();
		
		System.out.println("\nDequing elements:");
		String temp=null;
		while((temp=str.deque())!=null)
		{
			System.out.println(temp);
		}
		
		

	}

}
