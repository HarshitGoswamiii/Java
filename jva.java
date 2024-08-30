import java.util.Scanner;
public class jva {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int second = s.nextInt();
        System.out.println("Select Your Operator : \n 1 : Addition\n 2 : Subtraction \n 3 : Multiply \n 4 : Divide");
        int calc = s.next().charAt(0);
        switch (calc) {
            case '1' :
                System.out.println(first+second);
                break;
            case '2' : 
                System.out.println(first-second);
                break;
            case '3' : 
                System.out.println(first*second);
                break;
            case '4' : 
                System.out.println(first/second);
                break;
            default:
                System.out.println("Invalid OPerator ");;
        }
        }
    }
