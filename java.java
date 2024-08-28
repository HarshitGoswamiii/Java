import java.util.Scanner;
public class java {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        char a = s.next().charAt(0);
        if(a>='A' && a<='Z'){
            System.out.println("Positive !");
        }
        else{
            System.out.println("Negative !");
        }
    }
}
