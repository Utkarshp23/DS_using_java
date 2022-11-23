package binarytree;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree b= new BinaryTree();
		
		int ch=0;
		Scanner sc= new Scanner(System.in);
		while(ch!=3)
		{
			System.out.println("\n--------------------------------");
			System.out.println("Enter choice : ");
			System.out.println("--------------------------------");
			System.out.println("1. Add Node to Binary Tree");
			System.out.println("2. Display Binary Tree");
			System.out.println("--------------------------------");
			System.out.print("> ");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.print("\ndata-> ");
				b.insert(sc.nextInt());
				break;
				
			case 2:
				System.out.print("\ntree-> ");
				b.display();
				break;
			case 3:
				break;
			}
			
		}
		

	}

}
