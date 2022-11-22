package question_2;

public class MyStack {
	private Book []arr;
	private int size;
	private int top;
	
	public MyStack()
	{
		this.size=5;
		this.arr= new Book[size];
		this.top=-1;
	}
	
	public MyStack(int size)
	{
		this.size=size;
		this.arr= new Book[this.size];
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
	
	public void push(Book elem)
	{
		if(!isFull())
		{

			arr[++top]=elem;
		}
		else {
			System.out.println("Stack is full");
		}
	}
	
	public Book pop()
	{
		Book data=null;
		if(!isEmpty())
		{
			data=arr[top];
			top--;
		}
		return data;
	}
	
	public Book peek()
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
				arr[i].displayBook();
				System.out.println("---------------------------------");
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
