package rotateRightLeft;

public class Main {
	
	public static void rotateRight(int []arr, int k)
	{
		int n=arr.length;
		k=k%n;
		reverse(arr,0,n-k-1);
//		for(int i=0;i<arr.length;++i)
//		{
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
		reverse(arr,n-k,n-1);
//		for(int i=0;i<arr.length;++i)
//		{
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
		reverse(arr,0,n-1);
//		for(int i=0;i<arr.length;++i)
//		{
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
	}
	
	public static void rotateLeft(int []arr, int k)
	{
		int n=arr.length;
		k=k%n;
		reverse(arr,0,k-1);

		reverse(arr,k,n-1);

		reverse(arr,0,n-1);

	}
	
	public static void reverse(int []arr,int start, int end)
	{
		int n=(end-start+1);
//		System.out.println("Start:"+start+" end:"+end+" size:"+n);
		for(int i=start;i<(start+n/2);i++)
		{
			
			int k=end-((n-1)-(end-i));
//			System.out.println("i:"+i+" k:"+k);
			int temp=arr[i];
			arr[i]=arr[k];
			arr[k]=temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {1,2,3,4,5,6,7};
		int k=7;
//		rotateRight(arr,k);
		rotateLeft(arr,k);
		
		System.out.println("Rotated array is: ");
		for(int i=0;i<arr.length;++i)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
