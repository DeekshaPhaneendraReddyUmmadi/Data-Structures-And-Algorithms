package Data_Structures.Linear.Dynamic.LinkedList.circular_linked_list;

public class Main {
    public static void main(String[] args) {
        // Create a new instance of CircularLinkedList
        CircularLinkedList<Integer> list = new CircularLinkedList<>();

        // Insert elements at the end of the list
        System.out.println("Inserting elements at the end: 1, 2, 3, 4");
        list.insertAtLast(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        
        // Insert elements at the beginning of the list
        System.out.println("Inserting elements at the beginning: 5, 6");
        list.insertAtFirst(5);
        list.insertAtFirst(6);
        
        // Insert an element at a specific location
        System.out.println("Inserting element 9 at index 2...");
        list.insertAtAnyLocation(9, 2);
        
        // Print the current state of the list
        System.out.print("Current List: ");
        list.printList();

        // Pop elements from the list
        System.out.println("Popping two elements from the list...");
        list.pop();
        list.pop();
        
        // Print the state of the list after popping
        System.out.print("List after popping two elements: ");
        list.printList();

        // Search for an element in the list
        System.out.println("Searching for element 3...");
        boolean found = list.search(3);
        System.out.println("Element 3 found: " + found);

        // Delete a specific element
        System.out.println("Deleting element 4...");
        list.delete(4);
        System.out.print("List after deleting element 4: ");
        list.printList();

        // Get the size of the list
        System.out.println("Size of the list: " + list.getSize());
    }
}




// public class Main {
//     public static void main(String[] args) {
//         CircularLinkedList<Integer> list = new CircularLinkedList<>();
//         list.insertAtLast(1);
//         list.insertAtLast(2);
//         list.insertAtLast(3);
//         list.insertAtLast(4);
//         list.insertAtFirst(5);
//         list.insertAtFirst(6);
//         list.insertAtAnyLocation(9, 2);
//         list.printList();
//         // list.insertAtAnyLocation(9, 3);
//         // list.delete(4);
//         // System.out.println((Node<Integer>)list.pop());
//         list.pop();
//         list.pop();
//         list.printList();
//     }
// }