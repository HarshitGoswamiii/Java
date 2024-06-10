import java.util.Scanner;

public class java05_if_else {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the value of A : ");
    int a = s.nextInt();
    System.out.print("Enter the value of B : ");
    int b = s.nextInt();
    System.out.println("| + | - | * | / |");
    System.out.print("Enter Your Choice : ");
    char calc = s.next().charAt(0);

    switch(calc){
        case '+':
            int add=a+b;
            System.out.println("Answer : "+add);
            break;
        case '-':
            int diff=a-b;
            System.out.println("Answer : "+diff);
            break;
        case '/':
            int div=a/b;
            System.out.println("Answer : "+div);
            break;
        case '*':
            int mul=a*b;
            System.out.println("Answer : "+mul);
            break;
        default:
            System.out.println("Invalid Operation");
            break;
    }

    }
}
            
            //         System.out.print("Enter Your Age : ");
            //         int age= s.nextInt();
            //         if (age<18){
            //             System.out.print("You Are not Elgigble For Drive !!");
            //         }
            //         else if (age==18){
            //             System.out.println("Apply for Licence First !!");
            //         }
            //         else{
            //             System.out.println("You Can drive !!");
            //         }
            // }