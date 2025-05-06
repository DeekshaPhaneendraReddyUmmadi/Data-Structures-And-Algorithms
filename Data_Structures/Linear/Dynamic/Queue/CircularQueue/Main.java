package Data_Structures.Linear.Dynamic.Queue.CircularQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Implementing with Linked List: \n");
        // Using Circular Queue with Linked List
        CircularQueueUsingLinkedList<Integer> linkedListQueue = new CircularQueueUsingLinkedList<>();
        linkedListQueue.enqueue(10);
        linkedListQueue.enqueue(20);
        linkedListQueue.enqueue(30);
        System.out.println("Front element is: " + linkedListQueue.peek());
        linkedListQueue.dequeue();
        System.out.println("Front element after dequeue: " + linkedListQueue.peek());
        linkedListQueue.enqueue(40);
        linkedListQueue.enqueue(50);
        linkedListQueue.enqueue(60); // Continue adding elements

        System.out.println("\n\nImplementing with Arrays: \n");
        // Using Circular Queue with Array
        CircularQueueUsingArray<Integer> arrayQueue = new CircularQueueUsingArray<>(5);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        System.out.println("Front element is: " + arrayQueue.peek());
        arrayQueue.dequeue();
        System.out.println("Front element after dequeue: " + arrayQueue.peek());
        arrayQueue.enqueue(40);
        arrayQueue.enqueue(50);
        arrayQueue.enqueue(60); // This will indicate that the queue is full
        arrayQueue.enqueue(70); // Attempt to enqueue when full
    }
}


// OUTPUT: 

// Implementing with Linked List: 

// 10 enqueued to queue
// 20 enqueued to queue
// 30 enqueued to queue
// Front element is: 10
// 10 dequeued from queue
// Front element after dequeue: 20
// 40 enqueued to queue
// 50 enqueued to queue
// 60 enqueued to queue


// Implementing with Arrays:

// 10 enqueued to queue
// 20 enqueued to queue
// 30 enqueued to queue
// Front element is: 10
// 10 dequeued from queue
// Front element after dequeue: 20
// 40 enqueued to queue
// 50 enqueued to queue
// 60 enqueued to queue
// Queue is full