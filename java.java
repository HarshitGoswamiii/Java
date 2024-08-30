public class java {
    public static void main(String[] args){
        // Palindrome 
        int a1=12321, a2=0;
        while(a1!=0){
            a1/=10;
            a2++;
        }
        System.out.println(a2);
    }
    }