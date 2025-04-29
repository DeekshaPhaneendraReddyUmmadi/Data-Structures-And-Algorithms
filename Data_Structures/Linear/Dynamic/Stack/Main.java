package Data_Structures.Linear.Dynamic.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(6);      // Instantiate the stack object with size 6.
        stack.push(43);      // push "5" to the stack.
        stack.push(23);     // push "34" to the stack.
        stack.push(87);     // push "12" to the stack.
        stack.push(69);     // push "67" to the stack.
        stack.push(9);      // push "67" to the stack.
        stack.peek();             // print peek element
        stack.pop();              // poping the last push element from the stack.
        stack.traverse();         // printing the all elements from the stack.
    }
}


// output :
// Peek element : 9
// +----------+
// |   Stack  |
// +----------+
// |    69    |  <- top
// |    87    |
// |    23    |
// |    43    |  <- bottom
// +----------+