public class Practice7 {
    // Practice 1 ------->

    // static void table(int a){
    //     for(int i =1; i<=10;i++){
    //         System.out.println(a*i);
    //     }
    // }
    // public static void main(String[] args){
    //     table(2);
    // }

    // Practice 2 ------>
    //  static void pattern(int a){
    //     for(int i=0; i<a;i++)
    //     {
    //         for(int j=0; j<i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println("");
    //     }
    //  }
    //  public static void main(String[] args) {
    //      pattern(5);
    //  }

    // Practice 3 ----->

    // static int add(int n){
    //     if(n==0||n==1){
    //         return 1;
    //     }
    //     else{
    //         return n +add(n-1);
    //     }
    // }
    // public static void main(String[] args) {
    // System.out.println("Sum : "+add(1));


    // Practice 4 -------->
    // static void pattern(int n){
    //     for(int i=n; i>=1;i--){
    //         for(int j=i;j>=1;j--){
    //             System.out.print("*");
    //         }
    //         System.out.println(" ");
    //     }
    // }
    // public static void main(String[] args) {
    //     pattern(4);
    // }

    // Practice 5 -------->

    //     static int  fib(int n){
    //         if(n==1){
    //             return 0;
    //         }
    //         else if(n==2){
    //             return 1;
    //         }
    //         else{
    //             return fib(n-1) + fib(n-2);
    //         }}
    // public static void main(String[] args){
    //     int result=fib(9);
    //     System.out.println("Fibonacci Series : "+ result);

    // Practice 6 ------->

    // static int setn(int ...arr){
    //     int num=0;
    //     for (int element : arr){
    //         num +=element; 
    //     }
    //     return num;
    // }
    // public static void main(String[] args) {
    //     int i=setn(7,2,4,6);
    //     System.out.println("Sum : "+i);
    //     int avg= i/4;
    //     System.out.println("Average : " + avg);
        

    // Practice 9 ------>

    static int conv(int x){
        return ((x*9)/5)+32;
    }
    public static void main(String[] args) {
        int w=5;
        System.out.println(conv(w));
    }
    }
