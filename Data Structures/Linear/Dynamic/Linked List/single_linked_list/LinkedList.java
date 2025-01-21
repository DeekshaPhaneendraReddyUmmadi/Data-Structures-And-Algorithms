package single_linked_list;

import java.util.HashSet;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int size = 0;
    boolean isEmity;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    private void insert(T data) {
        Node<T> node = new Node<T>(data); // Create a new node with the provided data
        head = node;
        tail = node;
        size++;
    }

    // this function add the new node at end of the list
    public void add(T data) {
        // If head is null then initialize a head
        if (head == null) {
            insert(data);
            return;
        }

        // Create a new node with the provided data
        Node<T> node = new Node<>(data);

        // If the list is not empty, link the new node to the end of the list
        tail.next = node; // Link the current tail to the new node
        tail = node; // Update the tail to the new node

        size++;
    }

    // this function add the new node at first of the list
    public void addFirst(T data) {
        // If head is null then initialize a head
        if (head == null) {
            insert(data);
            return;
        }

        // Create a new node with the provided data
        Node<T> node = new Node<T>(data);

        // If the list is not empty, link the new node to the starting of the list
        node.next = head;
        head = node;

        size++;
    }

    // this function add the new node at any location of the list
    public void addAtAny(T data, int location) {
        if (location > size) {
            add(data);
            return;
        }

        // If location is 0 then insert at first
        if (location == 0) {
            addFirst(data);
            return;
        }
        // If head is null then initialize a head
        if (head == null) {
            insert(data);
            return;
        }

        // Create a new node with the provided data
        Node<T> node = new Node<T>(data);
        Node<T> temp = head;
        for (int i = 0; i < location - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    // this function searches the list if the value is present returns true else false
    public boolean search(T data) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // this function delete the node based on value provided
    public void delete(T data) {
        Node<T> temp = head;
        if (temp.data == data) {
            deleteAtFirst();
            return;
        }
        if (tail.data == data) {
            deleteAtLast();
            return;
        }
        while (temp != null) {
            if (temp.next.data == data) {
                temp.next = temp.next.next;
                size--;
                break;
            }
            temp = temp.next;
        }
        System.out.println("Data " + data + " not found in the list.");
    }

    // this function delete the first node
    public void deleteAtFirst() {
        if (head != null) {
            head = head.next;
        }
        size--;
        return;
    }

    // this function delete the last node
    public Node<T> pop() {
        if (head == null) {
            System.out.println("The SLL does not exist");
            return null;
        }
        Node<T> temp = head;
        int count = size;
        while (temp != null && count != 2) {
            temp = temp.next;
            count--;
        }
        temp.next = null;
        Node<T> res = tail;
        tail = temp;
        tail.next = null;
        size--;
        return res;
    }
    
    // this function delete the last node
    public void deleteAtLast() {
        Node<T> temp = head;
        int count = size;
        while (temp != null && count != 2) {
            temp = temp.next;
            count--;
        }
        temp.next = null;
        size--;
    }

    // this function delete the node based on the location 
    public void deleteAtAny(int location) {
        if (!isEmity) {
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

        Node<T> temp = head;
        int i = 1;
        while (i < location - 1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        size--;
    }

    // Remove Duplicates from list
    public void removeDup() {
        HashSet<Integer> set = new HashSet<>();
        Node<T> current = head;
        Node<T> tail = null;
        while (current != null) {
            if (set.contains(current.data)) {
                tail.next = current.next;
                size--;
            } else {
                set.add((int) current.data);
                tail = current;
            }

            current = current.next;
        }
    }


    Node<T> nthToLast(int n) {
        // Initialize two pointers, p1 and p2, to the head of the linked list
        Node<T> p1 = head;
        Node<T> p2 = head;
    
        // Move p2 n nodes ahead in the list
        for (int i = 0; i < n; i++) {
            // If p2 becomes null before completing n steps, the list is shorter than n
            if (p2 == null)
                return null; // Return null if n is greater than the length of the list
            p2 = p2.next; // Move p2 to the next node
        }
    
        // Move both pointers until p2 reaches the end of the list
        while (p2 != null) {
            p1 = p1.next; // Move p1 to the next node
            p2 = p2.next; // Move p2 to the next node
        }
    
        // p1 is now pointing to the nth node from the end of the list
        return p1; // Return the nth node from the end
    }
    
    void partition(int n){
        Node<T> temp = head;
        while(temp != null){
            if ((int)(temp.next.data) < n) {
                Node<T> curNode = temp.next;
                temp.next = temp.next.next;
                curNode.next = head;
                head = curNode;
            }
            temp = temp.next;
        }
    }

    // void partition(int n) {
    //     // Start with a temporary pointer at the head of the list
    //     Node<T> temp = head;
    
    //     // Traverse the linked list until the end
    //     while (temp != null) {
    //         // Check if the next node's data is less than n
    //         if ((int)(temp.next.data) < n) {
    //             // Store the current node that needs to be moved
    //             Node<T> curNode = temp.next;
    
    //             // Bypass the current node in the list
    //             temp.next = temp.next.next;
    
    //             // Insert the current node at the front of the list
    //             curNode.next = head; // Point the current node to the current head
    //             head = curNode; // Update the head to be the current node
    //         }
    //         // Move to the next node in the list
    //         temp = temp.next;
    //     }
    // }
    

    public void printList() {
        // If list is empty it return back the method call
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }

        int i = size - 1;
        Node<T> temp = head;
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
            isEmity = false;
        }
        return isEmity;
    }

    // It sums two linked list
    void sum(LinkedList<T> ll1 , LinkedList<T> ll2){
        int sum1 = 0;
        Node<T> temp1 = ll1.head;
        int i = 0;
        while(temp1 != null){
            int zero = 1;
            if(sum1 != 0){
                zero = (int) Math.pow(10, i);
            }
            sum1 += (int)temp1.data * zero;
            temp1 = temp1.next;
            i++;
        }
        int sum2 = 0;
        Node<T> temp2 = ll2.head;
        int j = 0;
        while(temp2 != null){
            int zero = 1;
            if(sum2 != 0){
                zero = (int) Math.pow(10, j);
            }
            sum2 += (int)(temp2.data) * zero;
            temp2 = temp2.next;
            j++;
        }
        System.out.println(sum1 + sum2);
    }
}