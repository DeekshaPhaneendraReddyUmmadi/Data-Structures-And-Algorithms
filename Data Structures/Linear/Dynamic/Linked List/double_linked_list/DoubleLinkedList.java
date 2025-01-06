package double_linked_list;

public class DoubleLinkedList<T> {
    Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public void insert(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void insertAtFirst(T data) {
        if(head == null){
            insert(data);
        }
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
        }
        size++;
    }

    public void insertAtAny(T data, int index) {
        if (index > size || index < 0) {
            System.out.println("Index out of bound");
        }
        if (index == 0) {
            insertAtFirst(data);
            return;
        }

        Node<T> node = new Node<>(data);
        Node<T> temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        node.prev = temp;
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        size++;
    }

    public void deleteAtLast(){
        if(head == null){
            System.out.println("List is empty!");
        }
        tail.prev.next = null;
        tail = tail.prev;
        size--;
    }
    
    public void deleteAtFirst(){
        if(head == null){
            System.out.println("List is empty!");
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    public void deleteAtAny(int index){
        if(head == null){
            System.out.println("List is empty!");
        }

        if(index < 0 || index >= size){
            System.out.println("Index out of bound!");
            return;
        }

        if(index == 0){
            deleteAtFirst();
            return;
        }
        if(index == size){
            deleteAtLast();
            return;
        }
        
        Node<T> temp = head;
        for(int i = 0; i < index;i++){
            temp = temp.next;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;
        
    }

    public void search(T data) {
        int count = 0;
        if (size == 0) {
            System.out.println("LIst is empty.");
            return;
        }
        Node<T> temp = head;
        while (temp != null) {
            count++;
            if (temp.data == data) {
                break;
            }
            temp = temp.next;
        }
        System.out.println(count);
    }

    public void printReverse() {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        Node<T> temp = tail;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.prev;
            if (temp != null) {
                System.out.print(" <- ");
            }
        }
    }

    public void printList() {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }
}