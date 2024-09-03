public class integer {
    public static void main(String[] args) {
        int num = 3, power = 4;
        int result = 0;
        for (int i = 0; i <= power; i++) {
            result = num * i;
        }
        System.out.print(num + "^" + power + "=" + result);
    }
}