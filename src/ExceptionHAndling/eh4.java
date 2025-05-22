package ExceptionHAndling;

import java.util.Scanner;

public class eh4 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                // Ask user for number of elements
                System.out.print("Enter number of elements in the array: ");
                int n = scanner.nextInt();

                if (n < 3) {
                    throw new Exception("Array must contain at least 3 elements.");
                }

                int[] arr = new int[n];

                // Read array elements
                System.out.println("Enter " + n + " integers:");
                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextInt();
                }

                int maxSum = Integer.MIN_VALUE;
                int a = 0, b = 0, c = 0;

                // Check all combinations of 3 elements
                for (int i = 0; i < n - 2; i++) {
                    for (int j = i + 1; j < n - 1; j++) {
                        for (int k = j + 1; k < n; k++) {
                            int sum = arr[i] + arr[j] + arr[k];
                            if (sum > maxSum) {
                                maxSum = sum;
                                a = arr[i];
                                b = arr[j];
                                c = arr[k];
                            }
                        }
                    }
                }

                System.out.println("Greatest pair of 3 numbers: " + a + ", " + b + ", " + c);
                System.out.println("Maximum Sum: " + maxSum);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }
