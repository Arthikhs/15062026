 import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int[] arr = new int[R * C];

        // Read matrix elements into 1D array
        for (int i = 0; i < R * C; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);

        // Print sorted matrix row-wise
        int index = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(arr[index++] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
} 
