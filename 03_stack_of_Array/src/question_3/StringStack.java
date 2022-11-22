package question_3;

public class StringStack {
	private String []arr;
	private int size;
	private int top;
	
	public StringStack()
	{
		this.size=5;
		this.arr= new String[size];
		this.top=-1;
	}
	
	public StringStack(int size)
	{
		this.size=size;
		this.arr= new String[this.size];
		this.top=-1;
	}
	
	public boolean isFull()
	{
		if(top==size-1)
			return true;
		return false;
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		return false;
	}
	
	public void push(String elem)
	{
		if(!isFull())
		{
//			if(!isEmpty())
//			{
//				arr[top]=elem;
//				top++;
//			}else {
//				top++;
//				arr[top]=elem;
//			}
			arr[++top]=elem;
		}
		else {
			System.out.println("Stack is full");
		}
	}
	
	public String pop()
	{
		String data=null;
		if(!isEmpty())
		{
			data=arr[top];
			top--;
		}
		return data;
	}
	
	public String peek()
	{
		if(!isEmpty())
		 return arr[top];
		
		return null;
	}
	
	public void display()
	{
		if(!isEmpty())
		{
//			System.out.println(getTop());
			for(int i=top;i>=0;i--)
			{
				System.out.println(arr[i]);
			}
		}
		else {
			System.out.println("Stack is Empty");
		}
	}
	
	public int getTop()
	{
		return top;
	}

}