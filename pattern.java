public class pattern {
    public static void main(String[] args) {
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                for (int k = 0; k < j; k++) {
                    for (int l = 0; l < k; l++) {
                        System.out.print("*");
                    }
                    // System.out.print("\n");
                }
            }
            System.out.print("\n");
        }
    }
}
