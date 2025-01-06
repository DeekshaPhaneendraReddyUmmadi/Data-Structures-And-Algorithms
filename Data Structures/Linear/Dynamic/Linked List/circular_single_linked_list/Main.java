package circular_single_linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.insertAtLast(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtFirst(5);
        list.insertAtFirst(6);
        list.insertAtAnyLocation(9, 2);
        list.printList();
        // list.insertAtAnyLocation(9, 3);
        // list.delete(4);
        // System.out.println((Node<Integer>)list.pop());
        list.pop();
        list.pop();
        list.printList();
    }
}
