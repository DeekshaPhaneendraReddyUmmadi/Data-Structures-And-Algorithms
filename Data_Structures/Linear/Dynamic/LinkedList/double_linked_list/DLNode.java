package Data_Structures.Linear.Dynamic.LinkedList.double_linked_list;

class DLNode<T> {
    T data;
    DLNode<T> prev;
    DLNode<T> next;
    
    public DLNode(){
        
    }

    public DLNode(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
