import java.util.Scanner;

public class jva {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = s.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = s.nextInt();
        System.out.println("Select Your Operator : \n 1 : Addition\n 2 : Subtraction \n 3 : Multiply \n 4 : Divide");
        System.out.print("Enter Your Choice : ");
        int calc = s.next().charAt(0);
        switch (calc) {
            case '1':
                System.out.println(first + second);
                break;
            case '2':
                System.out.println(first - second);
                break;
            case '3':
                System.out.println(first * second);
                break;
            case '4':
                System.out.println(first / second);
                break;
            default:
                System.out.println("Invalid OPerator ");
                ;
        }
    }
}
