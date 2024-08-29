// import java.util.Scanner;
public class java {
    public static void main(String[] args){
        int a = 2321;
        int rev = 0;
            for(a; a!0;a/10){
                int d= a%10;
                rev= rev*10+d;
            }
            System.out.println("Reverse : "+rev);
        }
    }
