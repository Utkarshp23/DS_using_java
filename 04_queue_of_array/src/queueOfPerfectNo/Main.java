package queueOfPerfectNo;

public class Main {
	
	public static void pushPerfectNums()
	{
		Queue q= new Queue(5);
		int cnt=1;
		int i=1;
		while(cnt<=4)
		{
			if(check(i))
			{
				q.enque(i);
				cnt++;
			}
			i++;
		}
		
		System.out.println("Queue of Perfect no.:");
		q.display();
	}
	
	public static boolean check(int n)
	{
		int sum=0;
		
		for(int i=1;i<=n/2;++i)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		
		if(sum==n)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		pushPerfectNums();
//		System.out.println("Hello");

	}

}
