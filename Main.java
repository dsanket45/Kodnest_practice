import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input dimensions
        System.out.println("Enter depth:");
        int depth = scanner.nextInt();
        System.out.println("Enter number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns:");
        int cols = scanner.nextInt();

        // Step 2: Create 3D array
        int[][][] arr = new int[depth][rows][cols];

        // Step 3: Populate the array
        System.out.println("Enter " + (depth * rows * cols) + " elements:");
        for (int d = 0; d < depth; d++) {
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    arr[d][r][c] = scanner.nextInt();
                }
            }
        }

        // Step 4: Print the 3D array layer by layer
        System.out.println("\n3D Array:");
        for (int d = 0; d < depth; d++) {
            System.out.println("Layer " + (d + 1) + ":");
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    System.out.print(arr[d][r][c] + " ");
                }
                System.out.println();
            }
        }

        // Step 5: Calculate and print sum of each layer
        for (int d = 0; d < depth; d++) {
            int sum = 0;
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    sum += arr[d][r][c];
                }
            }
            System.out.println("Sum of layer " + (d + 1) + ": " + sum);
        }

        scanner.close();
    }
}
