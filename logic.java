public class logic {
    public static void main(String[] args) {
        int last =4;
        int first=1;
        for(int i = 1; i<=last;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(first*first + " ");
                first++;
            }
            System.out.print("\n");
        }
    }
}
