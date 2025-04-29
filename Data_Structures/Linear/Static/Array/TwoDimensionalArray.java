public class TwoDimensionalArray {
    public static void main(String[] args) {
        // Creating a 2D array
        int[][] numbers = {
            {8, 32, 55},
            {44, 6, 246},
            {967, 97, 12}
        };

        // Accessing an element
        System.out.println("Element at row 1, column 2: " + numbers[1][2]); // Output: 246

        // Modifying an element
        numbers[0][1] = 10;
        System.out.println("Modified element at row 0, column 1: " + numbers[0][1]); // Output: 10

        // Traversing the 2D array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // New line for each row
        }
    }
}
