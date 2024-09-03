public class pattern {
    public static void main(String[] args) {
        for (int k = 0; k < 4; k++) {
            for (int l = 0; l < k; l++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
