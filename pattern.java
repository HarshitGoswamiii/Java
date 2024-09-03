public class pattern {
    public static void main(String[] args) {
        char ch1='A',ch2='E';
        for (int k = 1; k <= (ch2 - 'A' + 1); ++k) {
            for (int l = 1; l <= k; ++l) {
                System.out.print(ch1+" ");
            }
            ++ch1;

            System.out.print("\n");
        }
        // for (int i = ch1; i > ch2; --i) {
        //     for (int j = 1; j <= i; ++j) {
        //         System.out.print(j);
        //     }
        //     System.out.print("\n");
        // }
    }
}
