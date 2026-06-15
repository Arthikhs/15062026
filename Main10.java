import java.util.*;

public class Main10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();
        int time = sc.nextInt();

        if (time <= 0 || time > 60) {
            System.out.println("error");
        } else {

            double speed = (distance * 18.0) / (time * 5);

            System.out.println(speed);
        }
    }
}