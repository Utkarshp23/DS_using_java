package binary_search_tree;

public class BinarySearchTree {
	class Node
	{
		private int data;
		private Node left;
		private Node right;
		
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	
	 Node root;
	 int nodes;
//	int height;
	public BinarySearchTree()
	{
		root=null;
//		height=0;
		nodes=0;
	}
	
	public void insert(int data)
	{
		Node rec= new Node(data);
		if(root==null)
		{
			root=rec;
			
		}else {
			Node temp= root;
			
			while(true)
			{
				if(data<temp.data)
				{
					if(temp.left==null)
					{
						temp.left=rec;
						break;
					}else {
						temp=temp.left;
					}
				}else {
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
	
	public void delete(int val)
	{
		Node temp=root;
		Node par=root;
		int f=0;
		while(temp.data!=val)
		{
			f=0;
			if(val<temp.data)
			{
				par=temp;
				temp=temp.left;
				f=-1;
			}
			else if(val>temp.data)
			{
				par=temp;
				temp=temp.right;
				f=1;
			}
		}
//		System.out.println("parD: "+par.data);
//		System.out.println("tempD: "+temp.data);
//		System.out.println("f: "+f);
		
		if(temp!=null)
		{		
			if(f==-1)
			{
				if(temp.left==null && temp.right==null)
				{
					par.left=null;
				}
				else if(temp.left!=null && temp.right==null)
				{
					par.left=temp.left;
				}
				else if(temp.left==null && temp.right!=null)
				{
					par.left=temp.right;
				}
				else
				{
					Node reg=temp.right;
					while(reg.left!=null)
					{
						reg=reg.left;
					}
					reg.left=temp.left;
					par.left=temp.right;
				}
			}
			
			if(f==1)
			{
				if(temp.left==null && temp.right==null)
				{
					par.right=null;
				}
				else if(temp.left!=null && temp.right==null)
				{
					par.right=temp.left;
				}
				else if(temp.left==null && temp.right!=null)
				{
					par.right=temp.right;
				}
				else
				{
					Node reg=temp.right;
					while(reg.left!=null)
					{
						reg=reg.left;
					}
					reg.left=temp.left;
					par.right=temp.right;
				}
			}
			
			if(f==0)
			{
				Node reg=temp.right;
				while(reg.left!=null)
				{
					reg=reg.left;
				}
				reg.left=temp.left;
				root=par.right;
			}
			
			
			temp=null;
		}
		
		
		
	}
	
	public int findMin()
	{
		Node temp= root;
		while(temp.left!=null)
			temp=temp.left;
		
		return temp.data;
	}
	
	public int findMax()
	{
		Node temp= root;
		while(temp.right!=null)
			temp=temp.right;
		
		return temp.data;
	}
	
	public boolean search(int elem)
	{
		Node temp=root;
		
		while(temp!=null && temp.data!=elem)
		{
			if(elem<temp.data)
				temp=temp.left;
			else
				temp=temp.right;
		}
		
		if(temp!=null)
		{
			return true;
		}
		return false;
	}
	
	public int findHeight(Node root,int h)
	{
		
		if(root.left==null && root.right==null)
		{
			return h;
		}
		if(root.left!=null && root.right==null)
			return Math.max(h,findHeight(root.left,h+1));
		
		if(root.left==null && root.right!=null)
			return Math.max(h,findHeight(root.right,h+1));
	
		return Math.max(findHeight(root.left,h+1), findHeight(root.right,h+1));
	}
	
	public int countNodes(Node root)
	{
		if(root!=null)
		{
			countNodes(root.left);
			nodes++;
			countNodes(root.right);
		}
		
		return nodes;
		
		
		
		
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
