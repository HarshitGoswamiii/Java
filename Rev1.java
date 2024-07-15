import java.util.Scanner;
public class Rev1 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);  
      System.out.print("Enter the Marks of English : ");
      int a = s.nextInt();
      System.out.print("Enter the Marks of Hindi : ");
      int b = s.nextInt();
      System.out.print("Enter the Marks of Maths : ");
      int c = s.nextInt();
      System.out.print("Enter the Marks of Social Science : ");
      int d = s.nextInt();
      System.out.print("Enter the Marks of Science : ");
      int e = s.nextInt();
      int sum = a+b+c+d+e;
      System.out.println("Sum : "+sum);
    }
}
