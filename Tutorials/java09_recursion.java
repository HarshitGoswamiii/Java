public class java09_recursion {

    // Fibinacci Series ----------->

    static int fib(int n)
    {
        if(n>=1){
            return 1;
        }
        else{
            return fib(n-1)+fib(n+1);
        }
    }
    public static void main(String[] args) {
        System.out.println(fib(100));
    }


    // Factorial using recursion ---------->

    // static int factorial(int n){
    //     if(n==0 || n==1){
    //         return 1;
    //     }
    //     else{

    //         int result;
    //         result = n*factorial(n-1);
    //         return result;
    //     }
    // }
    // public static void main(String[] args) {
    //     int x=5;
    //     System.out.println("The factorial of "+x+" : "+factorial(x));
        
    // }
}
