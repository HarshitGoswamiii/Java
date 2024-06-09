
import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Question 6 
        System.out.print("Enter your Website : ");
        String website= s.nextLine();
        if(website.endsWith(".com")){
            System.out.println("It is Commercial Wesbite.");
        }
        else if (website.endsWith(".org")){
            System.out.println("It is Organisation Website");
        }
        else if (website.endsWith(".in")){
            System.out.println("It is Indian Wesbite");
        }


        // Question 5 

        // System.out.print("Enter the Year : ");
        // int y=s.nextInt();
        // if(y%4==0){
        //     System.out.println(y+" is a leap year.");
        // }
        // else{
        //     System.out.println(y+" is not a leap yaer.");
        // }


        // Question 3 --------> INCOME TAX CALCULATOR
    //     System.out.print("Enter Your Income(In LPA) : ");
    //     double salary = s.nextDouble();
    //     double tax = 0;
    //     if (salary < 250000) {
    //         tax = tax + 0;

    //     } else if (salary >= 250000 && salary < 500000) {
    //         tax = tax + 0.05 * (salary - 250000);

    //     } else if (salary >= 500000 && salary < 1000000) {
    //         tax = tax + 0.05 * (500000 - 250000);
    //         tax = tax + 0.20 * (salary - 500000);
    //     }
    //     else if (salary>=1000000){
    //         tax = tax + 0.05 * (500000 - 250000);
    //         tax = tax + 0.20 * (1000000 - 500000);
    //         tax = tax + 0.20 * (salary - 1000000);

    //     }
    // double t=tax+salary;
    // System.out.println("Tax Payable : "+tax);
    // System.out.println("Total Amount : "+t);


        // Question 2 --------> PASS / FAIL
        // System.out.print("English : "); 
        // int e=s.nextInt();
        // System.out.print("Hindi : "); 
        // int h=s.nextInt();
        // System.out.print("Maths : "); 
        // int m=s.nextInt();
        // int avg=(e+h+m)/3;
        // System.out.println("Overall Percentage : "+avg);
        // if(avg>=40 && e>=33 && h>=33 && m>=33){
        //     System.out.println("You are passed.");
        // }
        // else{
        //     System.out.println("You are ailed.");
        // }
    }
}
