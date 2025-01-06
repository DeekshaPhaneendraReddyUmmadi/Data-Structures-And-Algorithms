package double_linked_list;

class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;
    
    public Node(){
        
    }

    public Node(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}