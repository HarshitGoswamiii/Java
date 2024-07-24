public class factorials {
    static int table(int n){
        int n1=1;
        for(int i = 0; i<=10;i++){
            n1= n*i;
        }
        return n1;
    }

    public static void main(String[] args) {
        int mul=table(5);
        System.out.println(mul);
    }
}
