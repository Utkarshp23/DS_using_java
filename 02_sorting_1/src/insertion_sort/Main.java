package insertion_sort;

public class Main {

	public static void insertion_sort(int[] a) {
		int n = a.length;
		for(int i=0;i<n;++i)
		{
			for(int j=i+1;j<n;++j)
			{
				if(a[j]<a[i])
				{
					int temp=a[j];
					while(j!=i)
					{
						a[j--]=a[j];
					}
					a[j]=temp;
					System.out.println("Pass :"+ (i+1));
					for(int k=0;k<n;++k)
					{
						System.out.print(a[k]+" ");
					}
					System.out.println("\n-------------------------------\n");
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[] arr = {10,9,8,7,6,5,4,3,2,1};
		
		insertion_sort(arr);
		
		for(int i=0;i<arr.length;++i)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
