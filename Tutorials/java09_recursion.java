public class java09_recursion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{

            int result;
            result = n*factorial(n-1);
            return result;
        }
    }
    public static void main(String[] args) {
        int x=4;
        System.out.println("The factorial of "+x+" : "+factorial(x));
        
    }
}
