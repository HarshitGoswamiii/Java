public class factorials {
    // static void table(int n){
    // for(int i = 1; i<=10;i++){
    // System.out.println(n+" * "+i+" = "+(n*i));
    // }
    // }
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void pattern2(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        // table(5);
        pattern(4);
        pattern2(4);
    }
}
