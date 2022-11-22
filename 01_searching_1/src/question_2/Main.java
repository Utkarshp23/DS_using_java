package question_2;

import java.util.Scanner;

public class Main {
	public static int find_Occ(int []a,int k)
	{
		int cnt=0;
		for(int i=0;i<a.length;++i)
		{
			if(a[i]==k)
			{
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {1,4,9,5,8,7,11,5,17,5};
		int k;
		System.out.println("Enter element to search:");
		Scanner sc=new Scanner(System.in);
		k=sc.nextInt();
		System.out.println("Occurence of element is: "+find_Occ(arr,k));
		
		

	}
}
