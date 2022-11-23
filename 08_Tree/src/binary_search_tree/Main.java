package binary_search_tree;

import java.util.Scanner;

import binarytree.BinaryTree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree b= new BinarySearchTree();
		
		int ch=0;
		Scanner sc= new Scanner(System.in);
		while(ch!=8)
		{
			System.out.println("\n--------------------------------");
			System.out.println("Enter choice : ");
			System.out.println("--------------------------------");
			System.out.println("1. Add Node to Binary Search Tree");
			System.out.println("2. Display Binary Search Tree");
			System.out.println("3. Delete node from Binary Search Tree");
			System.out.println("4. Find Min");
			System.out.println("5. Find Max");
			System.out.println("6. Search element");
			System.out.println("7. Find Height ");
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
				System.out.print("Enter element to delete-> ");
				b.delete(sc.nextInt());
				break;
			case 4:
				System.out.println("Minimum elem is:"+ b.findMin());
				break;
				
			case 5:
				System.out.println("Maximum elem is:"+ b.findMax());
				break;
				
			case 6:
				System.out.println("Enter element to search :");
				if(b.search(sc.nextInt()))
				{
					System.out.println("Element found");
				}else {
					System.out.println("Element not found");
				}
				break;
				
			case 7:
				System.out.println("Height is : "+b.findHeight(b.root, 0));
				break;
				
			case 8:
				break;
			}
			
		}
	}

}
