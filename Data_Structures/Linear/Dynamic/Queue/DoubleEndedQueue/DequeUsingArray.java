package Data_Structures.Linear.Dynamic.Queue.DoubleEndedQueue;

public class DequeUsingArray<T> {
    private T[] deque;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public DequeUsingArray(int capacity) {
        this.capacity = capacity;
        this.deque = (T[]) new Object[capacity];
        this.front = -1;
        this.rear = 0;
        this.size = 0;
    }

    // Method to add an element at the front
    public void addFront(T data) {
        if (size == capacity) {
            System.out.println("Deque is full");
            return; // Indicating that the deque is full
        }
        front = (front + 1) % capacity; // Circular increment
        deque[front] = data;
        size++;
        System.out.println(data + " added to the front");
    }

    // Method to add an element at the rear
    public void addRear(T data) {
        if (size == capacity) {
            System.out.println("Deque is full");
            return; // Indicating that the deque is full
        }
        rear = (rear - 1 + capacity) % capacity; // Circular decrement
        deque[rear] = data;
        size++;
        System.out.println(data + " added to the rear");
    }

    // Method to remove an element from the front
    public T removeFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return null; // Indicating that the deque is empty
        }
        T data = deque[front];
        front = (front - 1 + capacity) % capacity; // Circular decrement
        size--;
        System.out.println(data + " removed from the front");
        return data;
    }

    // Method to remove an element from the rear
    public T removeRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return null; // Indicating that the deque is empty
        }
        T data = deque[rear];
        rear = (rear + 1) % capacity; // Circular increment
        size--;
        System.out.println(data + " removed from the rear");
        return data;
    }

    // Method to check if the deque is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the size of the deque
    public int getSize() {
        return size;
    }

    // Method to get the front element of the deque
    public T peekFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return null; // Indicating that the deque is empty
        }
        return deque[front];
    }

    // Method to get the rear element of the deque
    public T peekRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return null; // Indicating that the deque is empty
        }
        return deque[rear];
    }
}
