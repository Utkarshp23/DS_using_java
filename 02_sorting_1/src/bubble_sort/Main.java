package bubble_sort;

import java.util.Scanner;

public class Main {
	public static void buble_sort(int[] a) {
		int n = a.length;
		for(int i=0;i<n-1;++i)
		{
			System.out.println("Pass: "+(i+1));
			int cnt=0;
			int swps=0;
			for(int j=0;j<(n-1)-i;++j)
			{
				cnt++;
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swps++;
				}
			}
			System.out.println("  Comparisons: "+cnt);
			System.out.println("  Swaps: "+swps+"\n");
			if(swps==0)
			{
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,8,1,9,3,10,4,11,5,12};
		
		buble_sort(arr);
		
		for(int i=0;i<arr.length;++i)
		{
			System.out.print(arr[i]+" ");
		}

	}
}
