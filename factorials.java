public class factorials {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int a=5;
        System.out.println("Factorial of "+a+" : "+factorial(a));
    }
}
