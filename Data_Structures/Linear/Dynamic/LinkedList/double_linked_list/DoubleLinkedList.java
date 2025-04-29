package Data_Structures.Linear.Dynamic.LinkedList.double_linked_list;

public class DoubleLinkedList<T> {
    DLNode<T> head;
    private DLNode<T> tail;
    private int size = 0;

    public void insert(T data) {
        DLNode<T> DLNode = new DLNode<>(data);
        if (head == null) {
            head = DLNode;
            tail = DLNode;
        } else {
            DLNode.prev = tail;
            tail.next = DLNode;
            tail = DLNode;
        }
        size++;
    }

    public void insertAtFirst(T data) {
        if(head == null){
            insert(data);
        }
        DLNode<T> DLNode = new DLNode<>(data);
        if (head == null) {
            head = DLNode;
            tail = DLNode;
        } else {
            head.prev = DLNode;
            DLNode.next = head;
            head = DLNode;
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

        DLNode<T> DLNode = new DLNode<>(data);
        DLNode<T> temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        DLNode.prev = temp;
        DLNode.next = temp.next;
        temp.next.prev = DLNode;
        temp.next = DLNode;
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
        
        DLNode<T> temp = head;
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
        DLNode<T> temp = head;
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
        DLNode<T> temp = tail;
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
        DLNode<T> temp = head;
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