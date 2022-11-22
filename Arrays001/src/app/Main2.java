package app;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 5, 4, 2, 3, 6, 7};
		int[] arr2 = { 7, 4, 8, 1, 9, 6 };
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		while (ch != 5) {

			System.out.println("MAIN MENU\n");
			System.out.println("---------------\n");
			System.out.println("1::Union\n");
			System.out.println("2::Intersection\n");
			System.out.println("3::[A-B]\n");
			System.out.println("4::[B-A]\n");
			
			System.out.println("11::Exit\n");
			System.out.println("---------------\n");
			System.out.println("Enter your choice (1-10) :\n");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				int []a= union(arr1,arr2);
				System.out.println("union of two array is: ");
				for(int i=0;i<a.length;i++)
				{
					System.out.print(a[i]+",");
				}
				System.out.println();
				
				break;
			
			
			case 2:
				int []b= intersection(arr1,arr2);
				System.out.println("union of two array is: ");
				for(int i=0;i<b.length;i++)
				{
					System.out.print(b[i]+",");
				}
				System.out.println();
				
				break;
				
			case 3:
				int []c= difference(arr1,arr2);
				System.out.println("union of two array is: ");
				for(int i=0;i<c.length;i++)
				{
					System.out.print(c[i]+",");
				}
				System.out.println();
				int []d= difference(arr2,arr1);
				System.out.println("union of two array is: ");
				for(int i=0;i<d.length;i++)
				{
					System.out.print(d[i]+",");
				}
				System.out.println();
				break;
			}
	}
	
}

	public static int [] union(int []arr1,int []arr2)
	{
		int[] a = new int[arr1.length+arr2.length];
		int temp=0;
		for(temp=0;temp<arr1.length;++temp)
		{
			a[temp]=arr1[temp];
		}
		boolean f=false;
		for(int i=0;i<arr2.length;i++)
		{
			f=false;
			for(int j=0;j<arr1.length;j++)
			{
				if(arr2[i]==arr1[j])
				{
					f=true;
					break;
				}
				
			}
			if(!f)
			{
				a[temp++]=arr2[i];
			}
			
		}
		return a;
	}
	
	public static int [] intersection(int []arr1,int []arr2)
	{
		int[] a = new int[arr1.length];
		
		int temp=0;
		for(int i=0;i<arr1.length;i++)
		{
			
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					a[temp++]=arr1[i];
					break;
				}
				
			}
			
		}
		return a;
		
	}
	
	public static int [] difference(int []arr1,int []arr2)
	{
		int[] a = new int[arr1.length];
		
		int temp=0;
		boolean f=false;
		for(int i=0;i<arr1.length;i++)
		{
			f=false;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					f=true;
					break;
				}
				
			}
			if(!f)
			{
				a[temp++]=arr1[i];
			}
			
		}
		return a;
		
	}
}

	

