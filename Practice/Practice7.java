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

    static void add(int n){
        for(int i =0; i<=n;i++){
            int sum=0;
            sum += i;
            // return sum;
        System.out.println("Sum : "+sum);
        }
    }
    public static void main(String[] args) {
    
    add(5);

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
}}
