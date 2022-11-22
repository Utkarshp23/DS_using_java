package circular_Queue;

public class CircularQueue {
		int front;
		int rear;
		int size;
		int []arr;
		
		public CircularQueue(int size)
		{
			this.size=size;
			front=rear=-1;
			arr=new int[size];
		}
		
		public boolean isFull() {
			if(front==(rear+1)%size)
			{
				return true;
			}
			return false;
		}
		
		public boolean isEmpty()
		{
			if(front==-1)
				return true;
			return false;
		}
		
		public void enque(int elem)
		{
			if(!(isFull()))
			{
				if(!(isEmpty()))
					rear=(rear+1)%size;
				else
				{
					rear=(rear+1)%size;
					front=(front+1)%size;
				}
				arr[rear]=elem;
			}else
			{
				System.out.println("Queue is Full");
			}
		}
		
		public int dequeue()
		{
			int d=-9999;
			if(!(isEmpty()))
			{
				d=arr[front];
				if(front==rear)
				{
					front=rear=-1;
				}else
				{
					front=(front+1)%size;
				}
			}
			return d;
		}
		
		public void display()
		{
			if(!(isEmpty()))
			{
				int i=front;
				int cnt=1;
				for( i=front;i!=rear;i=(i+1)%size)
				{
					System.out.print(arr[i]+" ");
					cnt++;
				}
				System.out.println(arr[i]);
				
				System.out.print("^");
				for(int j=1;j<2*cnt-2;++j)
					System.out.print(" ");
				System.out.println("^");
				
				System.out.print("|");
				for(int j=1;j<2*cnt-2;++j)
					System.out.print(" ");
				System.out.println("|");
				
				System.out.print("f");
				for(int j=1;j<2*cnt-2;++j)
					System.out.print(" ");
				System.out.println("r");
				
			}
			else {
				System.out.println("Queue is Empty");
			}
		}

		public int getFront() {
			return front;
		}

		public int getRear() {
			return rear;
		}
		
}
