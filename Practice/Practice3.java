import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String n= s.nextLine();

        // Practice 1 ------>
        // String N1= n.toLowerCase();
        // System.out.println(N1);

        // Practice 2 ------->
        // String n2 = n.replace(" ","_");
        // System.out.println(n2);

        // Practice 3 -------->
        // String l= "Dear <|name|>, Thanks alot.";
        // String r= l.replace("<|name|>", n);
        // System.out.println(r);

        // Practice 4 ------->
        System.out.println(n.indexOf("  "));
        System.out.println(n.indexOf("   "));


        // Practice 5 ------->
        // String ls = "Dear Honey, \nThis Java Course Is Nice. \nThanks.";
        // System.out.println(ls);

    }
}
