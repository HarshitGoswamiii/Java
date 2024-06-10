
import java.util.Scanner;

public class java06_Loops{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = s.nextInt();
        for (int i = n; i != 0 ; i--) {
            // System.out.println(2*i+1);
            System.out.println(i);
        }

        // Do-While Loop
        // int f=1;
        // do { 
        //     System.out.println(f);
        //     f++;
        // } while (f<i);

        // While Loop ------->
        // while(i<=10){
        //         System.out.println(i);
        //         i++;
        //     }
            System.out.println("Thankyou !");
        System.out.println("End of the Loop !");
    }
}
