package balancedParanthesis;

import java.util.Scanner;

import blueprint.CharStack;
import blueprint.Stack;


public class Main {

	public static boolean isBalancedParanthesis(String s)
	{
		int n=s.length();
		CharStack stk=new CharStack(n);
		for(int i=0;i<n;i++)
		{
			char ch=s.charAt(i);
			if(ch=='{'|| ch=='['|| ch=='(')
			{
				stk.push(ch);
			}
			else {
//				System.out.println("peek:"+stk.peek());
				if(check(stk.peek(),ch))
				{
					stk.pop();
				}else {
					stk.push(ch);
				}
			}
		}
//		System.out.println("Stack is:");
//		stk.display();
//		System.out.println();
		if(stk.isEmpty())
			return true;
		return false;
	}
	
	public static boolean check(char a, char b)
	{
		if((a=='{'&& b=='}') || (a=='('&& b==')') || (a=='['&& b==']'))
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the expression:");
		String s= sc.next();
		
		if(isBalancedParanthesis(s))
		{
			System.out.println(s+ " Is Balanced");
		}else {
			System.out.println(s+ " Is not Balanced");
		}
	}

}
