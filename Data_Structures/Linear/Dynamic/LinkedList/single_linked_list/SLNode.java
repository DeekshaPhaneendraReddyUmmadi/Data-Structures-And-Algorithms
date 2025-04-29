package Data_Structures.Linear.Dynamic.LinkedList.single_linked_list;

class SLNode<T> {
    T data;
    SLNode<T> next;

    public SLNode(){
        
    }

    public SLNode(T data) {
        this.data = data;
        this.next = null;
    }
}