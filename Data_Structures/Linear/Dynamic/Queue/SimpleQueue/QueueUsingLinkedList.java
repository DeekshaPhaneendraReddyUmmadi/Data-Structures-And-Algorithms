package Data_Structures.Linear.Dynamic.Queue.SimpleQueue;
class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueUsingLinkedList<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public QueueUsingLinkedList() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Method to add an element to the queue
    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(data + " enqueued to queue");
    }

    // Method to remove an element from the queue
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null; // Indicating that the queue is empty
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
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
        return front.data;
    }
}
