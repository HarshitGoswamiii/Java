import java.util.Scanner;
public class cgpa {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your marks of Ist Subject : ");
        int a= s.nextInt();
        System.out.print("Enter Your marks of IInd Subject : ");
        int b= s.nextInt();
        System.out.print("Enter Your marks of IIIrd Subject : ");
        int c= s.nextInt();
        int total= a+b+c;
        int totalsub=3;
        System.out.println("CGPA : "+(total/totalsub));
    }
}
