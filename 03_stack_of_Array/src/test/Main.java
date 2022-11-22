package test;

import blueprint.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
//		System.out.println(s.getTop());
		s.push(10);
//		System.out.println(s.getTop());
		s.push(20);
//		System.out.println(s.getTop());
		s.push(30);
		s.push(40);
		s.push(50);
//		s.push(60);
		
		System.out.println("Elements of stack are:");
		s.display();
		
		s.pop();
		s.pop();
		System.out.println("Elements of stack are:");
		s.display();
		
		System.out.println("Top Elements of stack are:"+s.peek());
		
	}

}
