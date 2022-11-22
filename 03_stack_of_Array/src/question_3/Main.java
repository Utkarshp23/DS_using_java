package question_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringStack s= new StringStack(10);
		System.out.println("Enter 10 cities: ");
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			
			String s1=sc.next();
			s.push(s1);
			
		}
		
		System.out.println("-------------------");
		System.out.println("City Stack is: ");
		s.display();
	}

}
