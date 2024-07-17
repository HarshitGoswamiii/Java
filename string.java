
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        // String a = "Happy Birthday";
        // String a1 = a.toLowerCase();
        // String a2 = a.replace(" ","_");
        // System.out.println("Lowercase : "+ a1);
        // System.out.println("Lowercase : "+ a2);  

        // 3rd Problem
        // String letter = "Dear name, thanks alot ! ";
        // letter= letter.replace("name", "Harshit");
        // System.out.println(letter);

        // 4th problem
        // String a= "Hello I'm  Harshit   Goswami";
        // int a1 = a.indexOf(' ');
        // System.out.println(a1);

        // int e = 20;
        // int h = 13;
        // int m = 78;
        // int avg=(e+h+m)/3;
        // if(avg<33){
        //     System.out.println("Fail !");
        // }
        // else{
        //     System.out.println("Pass !");
        // }

        Scanner s= new Scanner(System.in);
        System.out.print("Enter your Salary : ");
        int a = s.nextInt();
        if(a<250000){
            System.out.println("No Tax ! ");
        }
        else if(a==250000 || a<=500000){
            int d= 5*a/100;
            System.out.println("Total Amount : "+(d+a));
        }
    }
}