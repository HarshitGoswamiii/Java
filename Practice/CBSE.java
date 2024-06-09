
import java.util.Scanner;

public class CBSE {

    public static void main(String[] args) {
        System.out.println("CBSE Percentage Calculator");
        Scanner S = new Scanner(System.in);
        System.out.print("English : ");
        int E = S.nextInt();
        System.out.print("Hindi : ");
        int H = S.nextInt();
        System.out.print("Maths : ");
        int M = S.nextInt();
        System.out.print("Science : ");
        int T = S.nextInt();
        System.out.print("Social Science : ");
        int SS = S.nextInt();

        System.out.print("||| MARKS OBTAINED |||\nEnglish : " + E + "\nHindi : " + H + "\nMaths : " + M + "\nScience : " + T + "\nSocial Science : " + SS);
        System.out.print("\n");

        int sum = E + H + M + T + SS;
        System.out.print("SUM of Student : " + sum + " / 500");

        System.out.print("\n");

        int avg = sum*100/500;
        System.out.print("Percentage : ");
        System.out.println(avg);
    }
}
