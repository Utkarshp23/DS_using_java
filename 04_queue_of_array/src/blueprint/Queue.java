package blueprint;

public class Queue {
	int[] arr;
	int rear;
	int front;
	int size;

	public Queue(int size) {
		this.size = size;
		front = -1;
		rear = -1;
		arr = new int[size];

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

	public void enque(int elem) {
		if (!isFull()) {
			if (!isEmpty()) {
				rear++;

			} else {
				front++;
				rear++;

			}
			arr[rear] = elem;
		} else {
			System.out.println("Queue is Full");
		}
	}

	public int deque() {
		int d = -9999;
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
			System.out.print("front(" + front + ")" + "-->");
			for (int i = front; i <= rear; ++i) {
				System.out.print(" " + arr[i]);
			}
			System.out.print("<--" + "rear(" + rear + ")");
			System.out.println();
		}else {
			System.out.println("Queue is Empty");
		}
		
	}

	public int getRear() {
		return rear;
	}

	public int getFront() {
		return front;
	}

}
