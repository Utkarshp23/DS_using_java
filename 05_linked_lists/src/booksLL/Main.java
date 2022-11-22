package booksLL;

public class Main {

	public static void main(String[] args) {
		
		List l= new List();
		
		l.createLL(3);
	
		System.out.println("LL is:");
		l.displayList();
		Book b=new Book("xyz",789);
		l.insertNode(b);
		System.out.println("LL is:");
		l.displayList();
		l.deleteAtPos(2);
		System.out.println("LL is:");
		l.displayList();

	}

}
