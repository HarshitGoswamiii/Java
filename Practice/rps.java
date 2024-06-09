import java.util.Random;
import java.util.Scanner;

public class rps {

    public static void main(String[] args) {
        System.out.println("1 = Rock \n2 = Paper \n3 = Scissors");
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your Choice : ");
        int f = s.nextInt();
        System.out.println("User's Choice : "+f);
        Random r = new Random();
        int i = r.nextInt(3) + 1;
        System.out.println("Computer Choice : " + i);
        // 1=Rock 2=Paper 3=Scissor
        // user=f com.=i
        if(f == i){
            System.out.println("DRAW !");
        }
        else if (f==1 && i==2) {
            System.out.println("Computer Wins !");
        }
        else if (f==1 && i==3){
            System.out.println("User Wins !");
        }
        else if (f==2 && i==1) {
            System.out.println("User Wins !");
        }
        else if (f==2 && i==3) {
            System.out.println("Computer Wins !");
        }
        else if (f==3 && i==1) {
            System.out.println("Computer Wins !");
        }
        else if (f==3 && i==2) {
            System.out.println("User Wins !");
        }
            System.out.println("\n");
    }
}