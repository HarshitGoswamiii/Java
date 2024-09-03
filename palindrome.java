
import java.util.stream.Stream;

public class palindrome {
    public static void main(String[] args){
        String spell = "Radar";
        String rev="";
        for(int i=(spell.length()-1) ;i>=0;--i){
            rev = rev+spell.charAt(i);
        }
        System.out.print(rev);
        if(rev.toLowerCase()==spell.toLowerCase()){
            System.out.println("This String is Palindrome String !");
        }
        else{
            System.out.println("This String is not a Palindrome String !");
        }
    }
}
