package nextGreaterElement;
public class NStack {
	private int []arr;
	private int size;
	private int top;
	
	public NStack()
	{
		this.size=5;
		this.arr= new int[size];
		this.top=-1;
	}
	
	public NStack(int size)
	{
		this.size=size;
		this.arr= new int[this.size];
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
	
	public void push(int elem)
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
	
	public int pop()
	{
		int data=-9999;
		if(!isEmpty())
		{
			data=arr[top];
			top--;
		}
		return data;
	}
	
	public int peek()
	{
		if(!isEmpty())
		 return arr[top];
		
		return -9999;
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