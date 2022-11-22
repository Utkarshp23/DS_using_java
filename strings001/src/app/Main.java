package app;

import java.util.Scanner;

public class Main {

	public static StringBuilder remove_duplicates(StringBuilder s)
	{
//		String s1="";
		int n=s.length();
		
		for(int i=1;i<s.length();++i)
		{
//			System.out.println("i:"+i);
			if(s.charAt(i)==s.charAt(i-1))
			{
				s.deleteCharAt(i);
				--i;
			}
//			System.out.println(s);
		}
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
//		String s= sc.next();
		StringBuilder sb = new StringBuilder(sc.next());
		System.out.println(remove_duplicates(sb));
	}

}
