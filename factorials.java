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
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n += sum(n-1);
        }
    }
    static void avg(int... arr){
        int sum=0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum/arr.length);
    }

    public static void main(String[] args) {
        // table(5);
        // pattern(4);
        // pattern2(4);
        // System.out.println(sum(5));
        avg(40,50,30,33,43);
    }
}
