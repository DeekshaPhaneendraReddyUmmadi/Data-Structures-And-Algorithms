package Data_Structures.Linear.Dynamic.LinkedList.circular_linked_list;

class CLNode<T> {
    T data;
    CLNode<T> next;

    public CLNode(){
    }

    public CLNode(T data) {
        this.data = data;
        this.next = null;
    }
}