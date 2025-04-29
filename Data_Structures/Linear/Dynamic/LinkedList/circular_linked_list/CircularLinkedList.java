package Data_Structures.Linear.Dynamic.LinkedList.circular_linked_list;

public class CircularLinkedList<T> {
    CLNode<T> head;
    CLNode<T> tail;
    int size = 0;
    boolean isEmpty;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    private void insert(T data) {
        CLNode<T> node = new CLNode<T>(data); // Create a new node with the provided data
        head = node;
        tail = node;
        size++;
    }

    public void insertAtLast(T data) {
        // If head is null then initialize a head
        if (head == null) {
            insert(data);
            return;
        }

        // Create a new node with the provided data
        CLNode<T> node = new CLNode<>(data);

        // If the list is not empty, link the new node to the end of the list
        tail.next = node; // Link the current tail to the new node
        tail = node; // Update the tail to the new node

        size++;
    }

    public void insertAtFirst(T data) {
        // If head is null then initialize a head
        if (head == null) {
            insert(data);
            return;
        }

        // Create a new node with the provided data
        CLNode<T> node = new CLNode<T>(data);

        // If the list is not empty, link the new node to the starting of the list
        node.next = head;
        head = node;

        size++;
    }

    public void insertAtAnyLocation(T data, int location) {
        if (location > size) {
            insertAtLast(data);
            return;
        }
        if (location == 0) {
            insertAtFirst(data);
            return;
        }
        // If head is null then initialize a head
        if (head == null) {
            insert(data);
            return;
        }

        // Create a new node with the provided data
        CLNode<T> node = new CLNode<T>(data);
        CLNode<T> temp = head;
        for (int i = 0; i < location-1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public boolean search(T data) {
        CLNode<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void delete(T data) {
        CLNode<T> temp = head;
        if (temp.data == data) {
            deleteAtFirst();
            return;
        }
        if (tail.data == data) {
            deleteAtLast();
            return;
        }
        while (temp.next != null) {
            if (temp.next.data == data) {
                temp.next = temp.next.next;
                size--;
                break;
            }
            temp = temp.next;
        }
        System.out.println("Data " + data + " not found in the list.");
    }

    public void deleteAtFirst() {
        if (head != null) {
            head = head.next;
        }
        size--;
        return;
    }


    public CLNode<T> pop() {
        if (head == null) {
            System.out.println("The SLL does not exist");
            return null;
        }
        CLNode<T> temp = head;
        int count = size;
        while (temp != null && count != 2) {
            temp = temp.next;
            count--;
        }
        temp.next = null;
        CLNode<T> res = tail;
        tail = temp;
        tail.next = null;
        size--;
        return res;
    }

    public void deleteAtLast() {
        CLNode<T> temp = head;
        int count = size;
        while (temp != null && count != 2) {
            temp = temp.next;
            count--;
        }
        temp.next = null;
        size--;
    }

    public void deleteAtAny(int location) {
        if (!isEmpty) {
            System.out.println("List is empty");
            return;
        }
        if (location <= 1) {
            deleteAtFirst();
            return;
        }
        if (location > size) {
            System.out.println("Location is invalid");
            return;
        }
        if (location == size) {
            deleteAtLast();
            return;
        }

        CLNode<T> temp = head;
        int i = 1;
        while (i < location - 1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void printList() {
        // If list is empty it return back the method call
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }

        int i = size - 1;
        CLNode<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if (i != 0) {
                System.out.print(" -> ");
                i--;
            }
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public boolean getIsEmity() {
        if (size != 0) {
            isEmpty = false;
        }
        return isEmpty;
    }
}
