
public class QueueArrayImplementation {
	private int[] queueArray;
	int front, rear;
	int capacity;
	int currentSize = 0;
	
	public QueueArrayImplementation(int size){
		this.capacity = size;
		front = 0;
		rear = -1;
		queueArray = new int[capacity];
	}
	
	//check if queue is full
	public boolean isFull(){
		if(currentSize == capacity)
			return true;
		return false;
	}
	
	//check if queue is empty
	public boolean isEmpty(){
		if(currentSize == 0)
			return true;
		return false;
	}
	
	public void enqueue(int data){
		if(isFull()){
			System.out.println("Queue is full, data can not inserted");
		}
		else{
			rear++;
			if(rear == capacity-1){
				rear = 0;
			}
			queueArray[rear]=data;
			currentSize++;
			System.out.println(data+" added to the queue");
		}
		
	}
	 
	public void dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty. Can not delete elements from queue");
		}
		else{
			front++;
			if(front == capacity-1){
				front = 0;
				System.out.println(queueArray[front-1]+" removed from queue");
			}
			System.out.println(queueArray[front-1]+" removed from queue");
		}
	}
	
	
	
public static void main(String[] args){
	QueueArrayImplementation queue = new QueueArrayImplementation(5);
	queue.enqueue(9);
	queue.enqueue(5);
	queue.dequeue();
	queue.enqueue(3);
	queue.dequeue();
}

}
