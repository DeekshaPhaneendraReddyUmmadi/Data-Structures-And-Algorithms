package Data_Structures.Linear.Dynamic.Queue.DoubleEndedQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Implementing with Linked List: \n");
        // Using Double-Ended Queue with Linked List
        DequeUsingLinkedList<Integer> linkedListDeque = new DequeUsingLinkedList<>();
        linkedListDeque.addFront(10);
        linkedListDeque.addRear(20);
        linkedListDeque.addFront(30);
        System.out.println("Front element is: " + linkedListDeque.peekFront());
        System.out.println("Rear element is: " + linkedListDeque.peekRear());
        linkedListDeque.removeFront();
        System.out.println("Front element after removing from front: " + linkedListDeque.peekFront());
        linkedListDeque.removeRear();
        System.out.println("Rear element after removing from rear: " + linkedListDeque.peekRear());

        System.out.println("\n\nImplementing with Arrays: \n");
        // Using Double-Ended Queue with Array
        DequeUsingArray<Integer> arrayDeque = new DequeUsingArray<>(5);
        arrayDeque.addFront(10);
        arrayDeque.addRear(20);
        arrayDeque.addFront(30);
        System.out.println("Front element is: " + arrayDeque.peekFront());
        System.out.println("Rear element is: " + arrayDeque.peekRear());
        arrayDeque.removeFront();
        System.out.println("Front element after removing from front: " + arrayDeque.peekFront());
        arrayDeque.removeRear();
        System.out.println("Rear element after removing from rear: " + arrayDeque.peekRear());
    }
}

// OUTPUT:

// Implementing with Linked List: 

// 10 added to the front
// 20 added to the rear
// 30 added to the front
// Front element is: 30
// Rear element is: 20
// 30 removed from the front
// Front element after removing from front: 10
// 20 removed from the rear
// Rear element after removing from rear: 10


// Implementing with Arrays:

// 10 added to the front
// 20 added to the rear
// 30 added to the front
// Front element is: 30
// Rear element is: 20
// 30 removed from the front
// Front element after removing from front: 10
// 20 removed from the rear
// Rear element after removing from rear: 10