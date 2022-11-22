package priority_queue;

public class PriorityQueue {
	Element [] arr;
	int rear;
	int front;
	int size;

	public PriorityQueue(int size) {
		this.size = size;
		front = -1;
		rear = -1;
		arr = new Element[size];

	}

	public boolean isEmpty() {
		if (front == -1 && rear == -1)
			return true;
		return false;
	}

	public boolean isFull() {
		if (rear == size - 1)
			return true;
		return false;
	}

	public void enque(Element elem) {
		if (!isFull()) {
			if (!isEmpty()) {
				rear++;

			} else {
				front++;
				rear++;

			}
			arr[rear] = elem;
			priortize();
			
		} else {
			System.out.println("Queue is Full");
		}
	}

	public Element deque() {
		Element d = null;
		if (!isEmpty()) {
			d = arr[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front++;
			}

		} 

		return d;
	}

	public void display() {
		if(!isEmpty())
		{
			int cnt=1;
			System.out.print("d: ");
			for (int i = front; i <= rear; ++i) {
				System.out.print(arr[i].getData()+" ");
				cnt++;
			}
			
			System.out.print("\np: ");
			for (int i = front; i <= rear; ++i) {
				System.out.print(arr[i].getPriority()+" ");
			}
			
			System.out.print("\n   ^");
			for(int j=1;j<2*cnt-4;++j)
				System.out.print(" ");
			System.out.println("^");
			
			System.out.print("   |");
			for(int j=1;j<2*cnt-4;++j)
				System.out.print(" ");
			System.out.println("|");
			
			System.out.print("   f");
			for(int j=1;j<2*cnt-4;++j)
				System.out.print(" ");
			System.out.println("r");
		}else {
			System.out.println("Queue is Empty");
		}
		
	}
	
	public void priortize()
	{
		int n= rear-front+1;
//		System.out.println("n:"+n);
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<(n-1)-i;j++)
			{
				if(arr[j].getPriority()<arr[j+1].getPriority())
				{
					Element temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	public int getRear() {
		return rear;
	}

	public int getFront() {
		return front;
	}

}
