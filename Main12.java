import java.util.Scanner;

public class Main12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input size
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        // Edge case
        if (n < 2) {
            System.out.println("At least 2 elements are required.");
            return;
        }

        int[] arr = new int[n];

        // Input array
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Initialize
        int minElement = arr[0];
        int maxDifference = arr[1] - arr[0];

        // Traverse array
        for (int i = 1; i < n; i++) {

            // Calculate difference
            int difference = arr[i] - minElement;

            // Update maximum difference
            if (difference > maxDifference) {
                maxDifference = difference;
            }

            // Update minimum element
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
        }

        System.out.println("Maximum Difference: " + maxDifference);

        scanner.close();
    }
}