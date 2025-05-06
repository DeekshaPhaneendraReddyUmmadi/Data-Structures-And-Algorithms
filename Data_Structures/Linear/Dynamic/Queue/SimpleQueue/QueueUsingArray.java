package Data_Structures.Linear.Dynamic.Queue.SimpleQueue;

public class QueueUsingArray<T> {
    private T[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        this.queue = (T[]) new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Method to add an element to the queue
    public void enqueue(T data) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return; // Indicating that the queue is full
        }
        rear = (rear + 1) % capacity; // Circular increment
        queue[rear] = data;
        size++;
        System.out.println(data + " enqueued to queue");
    }

    // Method to remove an element from the queue
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null; // Indicating that the queue is empty
        }
        T data = queue[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        System.out.println(data + " dequeued from queue");
        return data;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the size of the queue
    public int getSize() {
        return size;
    }

    // Method to get the front element of the queue
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null; // Indicating that the queue is empty
        }
        return queue[front];
    }
}
