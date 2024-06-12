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

    // Practice 4 -------->
    static void pattern(int n){
        for(int i>0; i>=n;i--){
            for(int j>0;j>i;j--){
                System.out.println("*");
            }
            System.out.println(" ");
        }
    }

}
