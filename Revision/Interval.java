public class Interval {
    public static void main(String[] args) {
        int num = 20, last = 50;
        while (num < last) {
            if (prime(num)) {
                System.out.print(num + " ");
                ++num;
            }
        }
    }

    static boolean prime(int n) {
        boolean flag = true;
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}