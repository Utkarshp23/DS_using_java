package postfixEvaluation;

import java.util.Scanner;
import blueprint.Stack;


public class Main {

	public static int calcPostValue(String s)
	{
		int res=0;
		int n=s.length();
		Scanner sc= new Scanner(System.in);
		Stack stk=new Stack(n);
		
		for(int i=0;i<n;i++)
		{
			char ch=s.charAt(i);
			if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
			{
				System.out.println("Enter the value of "+ ch +" :");
				int temp=sc.nextInt();
				stk.push(temp);
			}
			else {
				int no1=stk.pop();
				int no2=stk.pop();
				
				switch(ch) {
					case '+':
						res=no2+no1;
						stk.push(res);
						break;
						
					case '-':
						res=no2-no1;
						stk.push(res);
						break;
						
					case '*':
						res=no2*no1;
						stk.push(res);
						break;
						
					case '/':
						res=no2/no1;
						stk.push(res);
						break;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a postfix expression:");
		String s = sc.next();

		System.out.println("Evaluate value is: " + calcPostValue(s));
	}

}
