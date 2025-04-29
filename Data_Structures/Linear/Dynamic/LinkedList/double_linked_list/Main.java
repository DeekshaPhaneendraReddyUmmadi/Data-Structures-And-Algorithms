package Data_Structures.Linear.Dynamic.LinkedList.double_linked_list;


public class Main {
    public static void main(String[] args) {
        // Create a new instance of DoubleLinkedList
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        
        // Insert elements into the list
        System.out.println("Inserting elements: 1, 2, 3, 4, 5");
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        
        // Print the current state of the list
        System.out.print("Current List: ");
        list.printList();

        // Delete the first element from the list
        System.out.println("Deleting the first element...");
        list.deleteAtAny(0);
        
        // Print the state of the list after deletion
        System.out.print("List after deleting the first element: ");
        list.printList();
        
        // Print the list in reverse order
        System.out.print("List in reverse order: ");
        list.printReverse();
        System.out.println(); // For better formatting
        
        // Insert an element at the beginning
        System.out.println("Inserting 0 at the beginning...");
        list.insertAtFirst(0);
        System.out.print("List after inserting 0 at the beginning: ");
        list.printList();
        
        // Insert an element at a specific index
        System.out.println("Inserting 6 at index 2...");
        list.insertAtAny(6, 2);
        System.out.print("List after inserting 6 at index 2: ");
        list.printList();
        
        // Delete the last element
        System.out.println("Deleting the last element...");
        list.deleteAtLast();
        System.out.print("List after deleting the last element: ");
        list.printList();
        
        // Search for an element
        System.out.println("Searching for element 3...");
        list.search(3);
        
        // Search for an element that does not exist
        System.out.println("Searching for element 10...");
        list.search(10);
        
        // Print the final size of the list
        System.out.println("Final size of the list: " + list.getSize());
    }
}


// public class Main {
//     public static void main(String[] args) {
//         DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
//         list.insert(1);
//         list.insert(2);
//         list.insert(3);
//         list.insert(4);
//         list.insert(5);
//         list.printList();
//         list.deleteAtAny(0);
//         list.printList();
//         list.printReverse();
//     }
// }