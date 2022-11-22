package priority_queue;

public class Element {
	int data;
	int priority;
	
	public Element(int d,int p)
	{
		data=d;
		priority=p;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "Element [data=" + data + ", priority=" + priority + "]";
	}
	
	
}
