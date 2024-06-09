import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {

        // Practice 1 ----->
        // int n=4;
        // for(int i=n;i>0;i--){
        // for(int j=0;j<i;j++){
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        // Practice 2-------->

        // int n1 = 5;
        // int k1=1;
        // int k = 0;
        // while (k <= n1) {
        //     k1 += n1;
        //     k++;
        // }
        // System.out.println("Ans. : " + k1);

        // Practice 3 ------>

        // Scanner s = new Scanner(System.in);
        // System.out.print("Enter Number : ");
        // int a = s.nextInt();
        // for(int i=1;i<=10;i++){
        //     System.out.println(a+" * "+i+" = "+(a*i));
        // }

        // Practice 4 ------>
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a1 = 10;
        for(int i=10;i>=1;i--){
            System.out.println(a1+" * "+i+" = "+(a1*i));
        }
}
}