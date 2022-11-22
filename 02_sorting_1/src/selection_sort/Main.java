package selection_sort;

public class Main {
	public static void selection_sort(int[] a) {
		int n = a.length;
		for(int i=0;i<n;i++)
		{
			System.out.println("Pass: "+ (i+1));
			int min=a[i];
			int index=i;
			int cmp=0;
			int swps=0;
			for(int j=i+1;j<n;++j)
			{
				
				cmp++;
				if(a[j]<min)
				{
					min=a[j];
					index=j;
					swps++;
				}
			}
			System.out.println("  Comparisons: "+cmp);
			System.out.println("  Swaps: "+swps+"\n");
			if(swps==0)
			{
				break;
			}
			a[index]=a[i];
			a[i]=min;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		selection_sort(arr);
		
		for(int i=0;i<arr.length;++i)
		{
			System.out.print(arr[i]+" ");
		}

	}
}
