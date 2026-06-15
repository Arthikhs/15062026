import java.util.Scanner;
public class Main11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if(number>=100&& number<=999){
      if(number%9==0){
        System.out.println(number+"is  is a three-digit number and divisible by 9");
      }
      else{
        System.out.println(number + " is a three-digit number but not divisible by 9.");
      }

    }
    else{
      System.out.println("error");
    }

    sc.close();
  }
  
}
