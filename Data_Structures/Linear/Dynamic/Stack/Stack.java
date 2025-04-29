package Data_Structures.Linear.Dynamic.Stack;

public class Stack<T> {
    private T[] stack;
    private int size = 0;
    private int top = -1;

    public Stack(int size){
        this.size = size;
        stack = (T[]) new Object[size];
    }

    // Insert new element to the top element
    public void push(T value){
        // Checks if the stack is full or not 
        // if yes print "stack is full" or insert into stack
        if(isEmpty()){
            System.out.println("Stack is full");
        }
        // inserting the element into stack
        stack[++top] = value;
    }
    
    // Delete the top most or last inserted element from the stack
    public void pop(){
        // Checks if the stack is full or not 
        // if stack is not empty pop the element from stack 
        // if stack is empty prints "stack is empty"
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        // just decrementing the top pointer so it will not point to the deleted element
        top--;
    }
    
    // Peek will print the top most element from the stack if it is not empty.
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        System.out.println("Peek element : " + stack[top]);
    }

    // Check if the stack is empty or not
    public boolean isEmpty(){
        if(top == size - 1){
            return true;
        }
        return false;
    }

    // Traverse the stack from top to bottom, or print the elements of the array in reverse order of their input.
    public void traverse(){
        System.out.println("+----------+");
        System.out.println("|   Stack  |");
        System.out.println("+----------+");
        System.out.print("|    "+ stack[top]+ "    |  <- top");
        for(int i = top - 1; i >= 0; i--){
            System.out.print("\n|    " + stack[i] + "    | ");
        }
        System.out.println(" <- bottom");
        System.out.print("+----------+");
    }
}
