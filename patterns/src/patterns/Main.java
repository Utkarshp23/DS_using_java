package patterns;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int w=(2*n)-1;
		
		int k=(w/2)-1;
		int l=(w/2)+1;
		
		for(int i=0;i<n;++i)
		{
			k=(w/2)-i;
			l=(w/2)+i;
			for(int j=0;j<w;++j)
			{
				if(j>=k && j<=l)
				{
					if((i>=0)&&(j==k||j==l||i==(n-1)))
					{
						System.out.print("*");
					}else if((i>=1)&&(j==k+1||j==l-1||i==(n-2)))
					{
						System.out.print("@");
					}else if((i>=2)&&(j==k+2||j==l-2||i==(n-3)))
					{
						System.out.print("#");
					}

				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
	}

}
