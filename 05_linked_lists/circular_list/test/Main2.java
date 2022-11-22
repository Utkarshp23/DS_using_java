package test;

import list.CircularList;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularList c= new CircularList();
		c.insert(1);
		c.insert(2);
		c.insert(3);
		c.insert(4);
		c.insert(5);
		c.display();
		c.deleteAtPos(3);
		System.out.println("List: ");
		c.display();
	}

}
