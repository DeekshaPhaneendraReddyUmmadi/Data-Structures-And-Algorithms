package Data_Structures.Linear.Dynamic.Queue.DoubleEndedQueue;

class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DequeUsingLinkedList<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public DequeUsingLinkedList() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Method to add an element at the front
    public void addFront(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
        System.out.println(data + " added to the front");
    }

    // Method to add an element at the rear
    public void addRear(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        size++;
        System.out.println(data + " added to the rear");
    }

    // Method to remove an element from the front
    public T removeFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return null; // Indicating that the deque is empty
        }
        T data = front.data;
        front = front.next;
        if (front != null) {
            front.prev = null;
        } else {
            rear = null; // Deque becomes empty
        }
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
        T data = rear.data;
        rear = rear.prev;
        if (rear != null) {
            rear.next = null;
        } else {
            front = null; // Deque becomes empty
        }
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
        return front.data;
    }

    // Method to get the rear element of the deque
    public T peekRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return null; // Indicating that the deque is empty
        }
        return rear.data;
    }
}
