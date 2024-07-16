public class grade {
    public static void main(String[] args){
        System.out.println("Encypting");
        char a = 'A';
        a = (char)(a +8);
        System.out.println("Grade : "+ a);
        System.out.println("Decrypting");
        a = (char)(a-8);
        System.out.print("Grade : "+ a);
    }
}
