import java.util.Arrays;
import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of persons
        int N = sc.nextInt();

        // Group size
        int T = sc.nextInt();

        int[] arr = new int[N];

        // Read efficiencies
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort array
        Arrays.sort(arr);

        int minDifference = Integer.MAX_VALUE;

        // Form groups of size T
        for (int i = 0; i + T - 1 < N; i += T) {

            int min = arr[i];

            int max = arr[i + T - 1];

            int difference = max - min;

            minDifference = Math.min(minDifference, difference);
        }

        // Output
        System.out.println(minDifference);

        sc.close();
    }
}