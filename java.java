
import java.util.Scanner;

public class java {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = s.nextInt();
        System.out.println(a);
        if(a%2==0){
            System.out.println("Even !");
        }
        else{
            System.out.println("Odd !");
        }
        }
    }