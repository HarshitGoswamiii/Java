
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Starting Point : ");
        int num = s.nextInt();
        System.out.print("Enter End Point : ");
        int last = s.nextInt();
        boolean flag = false;
        while (num < last) {
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
        if (!flag && num != 0 && num != 1) {
            System.out.println(num + " ");
        
        ++num;
        }
        }
        // if (!flag) {
        // System.out.println("Prime Number ! ");
        // } else {
        // System.out.println("Not a Prime Number ! ");
        // }
    }
}
