import java.util.Scanner;

public class Ma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter rows: ");
        int m = scanner.nextInt();

        System.out.print("Enter columns: ");
        int n = scanner.nextInt();

        int[][] grid = new int[m][n];

        // Input grid
        System.out.println("Enter grid values (0 for free, 1 for obstacle):");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        // If starting or ending cell is blocked
        if (grid[0][0] == 1 || grid[m - 1][n - 1] == 1) {
            System.out.println("Unique Paths: 0");
            return;
        }

        // DP array
        int[][] dp = new int[m][n];

        // Starting point
        dp[0][0] = 1;

        // Fill first column
        for (int i = 1; i < m; i++) {

            if (grid[i][0] == 0) {
                dp[i][0] = dp[i - 1][0];
            }
        }

        // Fill first row
        for (int j = 1; j < n; j++) {

            if (grid[0][j] == 0) {
                dp[0][j] = dp[0][j - 1];
            }
        }

        // Fill remaining cells
        for (int i = 1; i < m; i++) {

            for (int j = 1; j < n; j++) {

                // Skip obstacle cells
                if (grid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {

                    // Paths from top + left
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        // Result
        System.out.println("Unique Paths: " + dp[m - 1][n - 1]);

        scanner.close();
    }
}