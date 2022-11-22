package question_1;

import java.util.Scanner;

public class Main {
	
	public static int search(int []a,int k)
	{
		for(int i=0;i<a.length;++i)
		{
			if(a[i]==k)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {1,4,9,5,8,7,11,23,17,13};
		int k;
		System.out.println("Enter element to search:");
		Scanner sc=new Scanner(System.in);
		k=sc.nextInt();
		System.out.println("Position of element is:"+search(arr,k));
		
		

	}

}
