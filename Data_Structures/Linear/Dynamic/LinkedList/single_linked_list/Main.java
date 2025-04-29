package Data_Structures.Linear.Dynamic.LinkedList.single_linked_list;

public class Main {
    public static void main(String[] args) {
        // Create a new instance of SingleLinkedList
        SingleLinkedList<Integer> ll1 = new SingleLinkedList<>();

        // Add elements to the linked list
        System.out.println("Adding elements to the linked list: 7, 1, 6");
        ll1.add(7);
        ll1.add(1);
        ll1.add(6);

        // Print the current state of the linked list
        System.out.print("Current List: ");
        ll1.printList();

        // Add more elements to the linked list
        System.out.println("Adding more elements: 5, 9, 2");
        ll1.add(5);
        ll1.add(9);
        ll1.add(2);

        // Print the updated state of the linked list
        System.out.print("Updated List: ");
        ll1.printList();

        // Search for an element in the linked list
        System.out.println("Searching for element 5...");
        boolean found = ll1.search(5);
        System.out.println("Element 5 found: " + found);

        // Search for an element that does not exist
        System.out.println("Searching for element 10...");
        found = ll1.search(10);
        System.out.println("Element 10 found: " + found);

        // Delete the first element
        System.out.println("Deleting the first element...");
        ll1.deleteAtFirst();
        System.out.print("List after deleting the first element: ");
        ll1.printList();

        // Delete the last element
        System.out.println("Deleting the last element...");
        ll1.deleteAtLast();
        System.out.print("List after deleting the last element: ");
        ll1.printList();

        // Delete a specific element
        System.out.println("Deleting element 1...");
        ll1.delete(1);
        System.out.print("List after deleting element 1: ");
        ll1.printList();

        // Add an element at the beginning
        System.out.println("Adding element 3 at the beginning...");
        ll1.addFirst(3);
        System.out.print("List after adding 3 at the beginning: ");
        ll1.printList();

        // Add an element at a specific index
        System.out.println("Adding element 4 at index 2...");
        ll1.addAtAny(4, 2);
        System.out.print("List after adding 4 at index 2: ");
        ll1.printList();

        // Remove duplicates (if any)
        System.out.println("Removing duplicates (if any)...");
        ll1.removeDup();
        System.out.print("List after removing duplicates: ");
        ll1.printList();

        // Get the size of the list
        System.out.println("Size of the list: " + ll1.getSize());

        // Sum two linked lists
        SingleLinkedList<Integer> ll2 = new SingleLinkedList<>();
        ll2.add(2);
        ll2.add(9);
        ll2.add(5);
        System.out.println("Summing two linked lists:");
        ll1.sum(ll1, ll2);
    }
}


// public class Main {
//     public static void main(String[] args) {
//         SingleLinkedList<Integer> ll1 = new SingleLinkedList<>();

//         ll1.add(7);
//         ll1.add(1);
//         ll1.add(6);

//         ll1.add(5);
//         ll1.add(9);
//         ll1.add(2);

//         ll1.printList();
        
//     }
// }
