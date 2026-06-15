import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            int n = sc.nextInt();

            int[] weights = new int[n];

            for (int i = 0; i < n; i++) {
                weights[i] = sc.nextInt();
            }

            int capacity = sc.nextInt();

            int sum = 0;
            int count = 0;

            for (int i = 0; i < n; i++) {

                if (sum + weights[i] > capacity) {
                    break;
                }

                sum += weights[i];
                count++;
            }

            System.out.println(count);

        } catch (Exception e) {

            System.out.println("Invalid Input");

        } finally {

            sc.close();
        }
    }
}