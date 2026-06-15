import java.util.Scanner;

public class Main5 {

    public static void calculateMembershipFee(int months) {

        int fee;

        switch (months) {

            case 1:
                fee = 1200;
                break;

            case 3:
                fee = 3000;
                break;

            case 6:
                fee = 6000;
                break;

            case 9:
                fee = 12000;
                break;

            case 12:
                fee = 15000;
                break;

            default:
                System.out.println("Invalid Plan");
                return;
        }

        System.out.println(fee);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int months = scanner.nextInt();

        calculateMembershipFee(months);

        scanner.close();
    }
}