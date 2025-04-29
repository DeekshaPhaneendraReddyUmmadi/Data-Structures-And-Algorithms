public class OneDimensionalArray {
    public static void main(String[] args) {
        // Creating an array
        int[] numbers = {8,32,55,44,6,246,967,97};

        // Accessing an element
        System.out.println("Element at index 2: " + numbers[2]); // Output: 3

        // Modifying an element
        numbers[1] = 10;
        System.out.println("Modified element at index 1: " + numbers[1]); // Output: 10

        // Traversing the array
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
