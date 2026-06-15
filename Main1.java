import java.util.Scanner;

public class Main1 {

    public static int calculateParkingFee(int hours) {

        if (hours <= 2) {

            return 100;

        } else if (hours <= 5) {

            return 100 + (hours - 2) * 50;

        } else {

            return 250 + (hours - 5) * 20;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            double input = Double.parseDouble(scanner.nextLine());

            if (input < 0) {

                System.out.println("Invalid Input");
                return;
            }

            int hours = (int) Math.ceil(input);

            int fee = calculateParkingFee(hours);

            System.out.println("Total parking fee: ₹" + fee);

        } catch (NumberFormatException e) {

            System.out.println("Invalid Input");

        } finally {

            scanner.close();
        }
    }
}