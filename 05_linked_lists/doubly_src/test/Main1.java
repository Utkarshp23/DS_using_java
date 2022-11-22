package test;

import doublyList.DoublyList;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Heello");
		
		DoublyList l= new DoublyList();
		
		l.insertNode(1);
		l.insertNode(2);
		l.insertNode(3);
		l.insertNode(4);
		l.insertNode(5);
		
		System.out.println("List is:");
		l.displayDll();

//		l.insertChoiceData("after", 6, 99);
//		System.out.println("List in reverse is: ");
//		l.displayR();
//		l.insertAtPos(0, 100);
		l.deleteAtPos(5);
		System.out.println("List is:");
		l.displayDll();
		
//		l.insertAtPos(3, 100);
//		System.out.println("List is:");
//		l.displayDll();
//		
//		l.insertAtPos(5, 100);
//		System.out.println("List is:");
//		l.displayDll();
//		
//		l.insertAtPos(7, 100);
//		System.out.println("List is:");
//		l.displayDll();
		
//		System.out.println("Size:"+l.getSize());
		
	}

}
