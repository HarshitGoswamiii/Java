public class palindrome {
    public static void main(String[] args){
        String spell = "Radr";
        String rev="";
        for(int i=(spell.length()-1) ;i>=0;--i){
            rev = rev+spell.charAt(i);
        }
        System.out.println(rev);
        if(rev.toLowerCase().equals(spell.toLowerCase())){
            System.out.println("This String is Palindrome String !");
        }
        else{
            System.out.println("This String is not a Palindrome String !");
        }
    }
}
