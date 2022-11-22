package question_2;

import java.util.Scanner;

import blueprint.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] b = new Book[3];
		MyStack s= new MyStack(3);
		Scanner sc = new Scanner(System.in);
		for (Book t : b) {
			System.out.println("Enter the type of Book: ");
			String tp = sc.next();
			System.out.println("Enter Name of Book: ");
			String name = sc.next();
			System.out.println("Enter Price of Book: ");
			double price = sc.nextInt();
			
			t = new Book(name, price);
			s.push(t);
		}
		s.display();
		
		

	}

}
