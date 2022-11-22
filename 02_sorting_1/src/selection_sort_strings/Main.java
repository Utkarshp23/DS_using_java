package selection_sort_strings;

public class Main {
	public static void selection_sort(String[] a) {
		int n = a.length;
		for(int i=0;i<n;i++)
		{
			System.out.println("Pass: "+ (i+1));
			String min=a[i];
			int index=i;
			int cmp=0;
			int swps=0;
			for(int j=i+1;j<n;++j)
			{
				
				cmp++;
//				if(a[j]<min)
				if(a[j].compareTo(min)<0)
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
//		a,b,c,d,e,f,g,h;
		String[] arr = {"h","g","f","e","d","c","b","a"};
		
		selection_sort(arr);
		
		for(int i=0;i<arr.length;++i)
		{
			System.out.print(arr[i]+" ");
		}

	}
}
