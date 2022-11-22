package app;

public class Swaping {
	
	public static void swapping(Integer x,Integer y)
	{
		Integer temp;
		temp=x;
		x=y.intValue();
		y=temp.intValue();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		int b=10;
		Integer A=a;
		Integer B=b;
		
		swapping(A,B);
		System.out.println(A.intValue()+" "+ B.intValue());
	}

}
