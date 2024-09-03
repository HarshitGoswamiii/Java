public class integer {
    public static void main(String[] args) {
        int num = 4, power = 4;
        int result = 1;
        for (int i = 1;i<=power;i++) {
            result *=num;
        }
        System.out.println(num + " ^ " + power + " = " + result);
    }
}