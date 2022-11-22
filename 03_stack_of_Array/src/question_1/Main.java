package question_1;

import blueprint.Stack;

public class Main {
	public static void storePrime()
	{
		Stack s= new Stack(10);
		int cnt=0;
		int i=2;
		while(cnt<10)
		{
			if(isPrime(i))
			{
				s.push(i);
				cnt++;
			}
			i++;
		}
		
		s.display();
		
	}
	
	public static boolean isPrime(int x)
	{
		for(int i=2;i<=x/2;++i)
		{
			if(x%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		storePrime();
	}

}
