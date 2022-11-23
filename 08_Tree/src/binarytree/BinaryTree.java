package binarytree;

import java.util.Scanner;

public class BinaryTree {
	
	class Node{
		private int data;
		private Node left;
		private Node right;
		
		Node(int d)
		{
			data= d;
			left=right=null;
		}
	}
	
	Node root;
	
	public BinaryTree()
	{
		root=null;
	}
	
	public void insert(int data)
	{
		Node rec= new Node(data);
		
		if(root==null)
		{
			root =rec;
		}
		else 
		{
			Scanner sc=new Scanner(System.in);
			Node temp=root;
			while(true)
			{
				System.out.println("\nWhere do  you want to insert left or right of " +temp.data);
				String ans=sc.next();
				
				if(ans.equals("left"))
				{
					if(temp.left==null)
					{
						temp.left=rec;
						break;
					}else {
						temp=temp.left;
					}
				}
				else {
					if(temp.right==null)
					{
						temp.right=rec;
						break;
					}else {
						temp=temp.right;
					}
					
				}
			}
		}
	}
	
	public void display()
	{
		inorder(root);
	}
	
	public void inorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}

}
