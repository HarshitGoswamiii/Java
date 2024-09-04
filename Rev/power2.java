import java.util.Scanner;

public class power2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = s.nextInt();
        System.out.print("Enter The Value of Power : ");
        int power = s.nextInt();
        int result = 1;
        for (int i = power; i >0; --i) {
            result *= num;
        }
        System.out.print(result);
    }
}
