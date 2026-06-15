import java.util.Scanner;

public class Main6 {

    public static void processTransaction(int senderBalance,
                                          int receiverBalance,
                                          int transferAmount) {

        if (senderBalance >= transferAmount) {

            senderBalance -= transferAmount;

            receiverBalance += transferAmount;

            System.out.println("Sender: " + senderBalance);

            System.out.println("Receiver: " + receiverBalance);

        } else {

            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int senderBalance = scanner.nextInt();

        int receiverBalance = scanner.nextInt();

        int transferAmount = scanner.nextInt();

        processTransaction(senderBalance,
                           receiverBalance,
                           transferAmount);

        scanner.close();
    }
}