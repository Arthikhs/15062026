import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        int R = sc.nextInt();
        int C = sc.nextInt();

        // Internal marks matrix
        int[][] internal = new int[R][C];

        // External marks matrix
        int[][] external = new int[R][C];

        // Read internal marks
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                internal[i][j] = sc.nextInt();
            }
        }

        // Read external marks
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                external[i][j] = sc.nextInt();
            }
        }

        // Given index
        int i = sc.nextInt();
        int j = sc.nextInt();

        // Calculate total marks
        int total = internal[i][j] + external[i][j];

        // Output
        System.out.println(total);

        sc.close();
    }
}