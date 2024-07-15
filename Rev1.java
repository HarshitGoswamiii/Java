import java.util.Scanner;
public class Rev1 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);  
      System.out.println("Enter the value of A : ");
      int a = s.nextInt();
      System.out.println("Enter the value of B : ");
      int b = s.nextInt();
      int sum = a+b;
      System.out.println("Sum : "+sum);
    }
}
