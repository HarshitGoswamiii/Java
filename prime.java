
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = s.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num/2; i++) {
            if(num%i==0){
                flag=true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Prime Number ! ");
        } else {
            System.out.println("Not a Prime Number ! ");
        }
    }
}
