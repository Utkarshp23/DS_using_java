package blueprint;

public class CharStack {
	char [] arr;
	int size;
	int top;
	
	public CharStack()
	{
		size=5;
		arr= new char[size];
		top=-1;
	}
	
	public CharStack(int n)
	{
		size=n;
		arr= new char[size];
		top=-1;
	}
	
	public void push(char elem)
	{
		if(!(isFull()))
		{
			top++;
			arr[top]=elem;
		}else
		{
			System.out.println("Stack is Full");
		}
		
	}
	
	public char pop()
	{
		char d='\0';
		if(!(isEmpty()))
		{
			d=arr[top];
			top--;
		}
		return d;
	}
	
	public char peek()
	{
		if(!(isEmpty()))
			return arr[top];
		else 
			return '\0';
	}
	
	public boolean isFull()
	{
		return top==size-1;
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public void display()
	{
		for(int i=top;i>=0;--i)
		{
			System.out.println(arr[i]);
		}
	}
}
