import java.util.Scanner;
public class java02 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Taking Input From  User !");
        System.out.print("Enter the Value of A : ");
        // f a= s.nextFloat();
        int a = s.nextInt();
        System.out.print("Enter the Value of B : ");
        int b= s.nextInt();
        System.out.print("Enter the Value of C : ");
        int c= s.nextInt();
        
        // int b = s.nextInt();
        float sum= a+b+c;
        System.out.print("The Sum of A And B : " + sum);
        // System.out.println(sum);

                                        // Practice 1 \\ ------>

        // System.out.println("Enter the value of Numbers : ");
        // int a=s.nextInt();
        // int b=s.nextInt();
        // int c=s.nextInt();
        // int sum = a+b+c;
        // System.out.println("Sum : "+sum);

                                        //Practice 2------>

        // int sum = a+b+c;
        // System.out.print("SUM of Student : " + sum + " / 300");

        // System.out.print("\n");

        // int avg = sum*100/300;
        // System.out.print("Percentage : ");
        // System.out.println(avg);

        // double cgpa = avg/9.5;
        // System.out.println("CGPA :"+cgpa);

                                        //Practice 3 ------->

        // System.out.print("Enter Your Name : ");
        // String name = s.nextLine();
        // System.out.println("Hello "+name+", have a good day."); 
    
                                         //Practice 4 -------->

        // System.out.print("Kilometers : ");
        // int k=s.nextInt();
        // double miles= k * 0.621371;
        // System.out.println("Miles : "+miles);

        // Practice 5 ------>
        // System.out.print("Enter The Number : ");
        // System.out.println(s.hasNextInt());

    }
}
