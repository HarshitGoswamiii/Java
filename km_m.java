import java.util.Scanner;

public class km_m {
    public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            System.out.print("Kilometres (KM) : ");
            int km= s.nextInt();
            double miles= km * 0.6213712;
            System.out.println("Miles : "+miles);
    }
}
