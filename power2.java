import java.util.Scanner;

public class power2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = s.nextInt();
        System.out.print("Enter The Value of Power : ");
        int power = s.nextInt();
        for (int i = 1; i <= power; i++) {
            num = num*i;
            i++;
        }
        System.out.print(num);
    }
}
