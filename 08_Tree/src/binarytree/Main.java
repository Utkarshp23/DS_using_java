package binarytree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree b= new BinaryTree();
		
		b.insert(1);
		b.insert(2);
		b.insert(3);
		
		b.inorder(b.root);

	}

}
