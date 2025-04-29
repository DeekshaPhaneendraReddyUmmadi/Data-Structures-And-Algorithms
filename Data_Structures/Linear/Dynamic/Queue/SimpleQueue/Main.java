package Data_Structures.Linear.Dynamic.Queue.SimpleQueue;

public class Main {
    public static void main(String[] args) {
        // QueueUsingLinkedList queue = new QueueUsingLinkedList();
        QueueUsingLinkedList<Integer> intQueue = new QueueUsingLinkedList<>();

        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);

        System.out.println("Front element is: " + intQueue.peek());

        intQueue.dequeue();
        System.out.println("Front element is: " + intQueue.peek());

        System.out.println("Queue size is: " + intQueue.getSize());

        intQueue.dequeue();
        intQueue.dequeue();

        // Trying to dequeue from an empty queue
        intQueue.dequeue();

        // Example with String type
        QueueUsingLinkedList<String> stringQueue = new QueueUsingLinkedList<>();
        stringQueue.enqueue("Hello");
        stringQueue.enqueue("World");

        System.out.println("Front element is: " + stringQueue.peek());
        stringQueue.dequeue();
        System.out.println("Front element is: " + stringQueue.peek());
    }
}

// output :

// 10 enqueued to queue
// 20 enqueued to queue
// 30 enqueued to queue
// Front element is: 10
// 10 dequeued from queue
// Front element is: 20
// Queue size is: 2
// 20 dequeued from queue
// 30 dequeued from queue
// Queue is empty
// Hello enqueued to queue
// World enqueued to queue
// Front element is: Hello
// Hello dequeued from queue
// Front element is: World

