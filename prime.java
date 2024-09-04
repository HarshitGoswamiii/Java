
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = s.nextInt();
        for (int i = 0; i <= num; i++) {
            if (num % i == 0) {
                System.out.println("Prime Number ! ");
            } else {
                System.out.println("Not a Prime Number ! ");
            }
        }
    }
}
