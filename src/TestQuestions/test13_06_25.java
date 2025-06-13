package TestQuestions;

import java.util.Scanner;

public class test13_06_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking for matrix size
        System.out.print("Enter the size of the matrix: ");
        int N = sc.nextInt();

        int[][] matrix = new int[N][N];

        // Asking for matrix elements
        System.out.println("Enter the matrix elements row-wise:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Asking for the required sum
        System.out.print("Enter the required sum: ");
        int S = sc.nextInt();

        int count = 0;

        // Loop over all possible square submatrices
        for (int size = 1; size <= N; size++) {
            for (int i = 0; i <= N - size; i++) {
                for (int j = 0; j <= N - size; j++) {
                    int sum = 0;

                    // Calculate the sum of the current submatrix
                    for (int x = 0; x < size; x++) {
                        for (int y = 0; y < size; y++) {
                            sum += matrix[i + x][j + y];
                        }
                    }

                    if (sum == S) {
                        count++;
                    }
                }
            }
        }

        // Output the result
        System.out.println("Count of submatrices with sum " + S + " is: " + count);
    }
}

