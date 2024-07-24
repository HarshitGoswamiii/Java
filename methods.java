public class methods {
    static int mul(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=x*y;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=7;
        int b=5;
        int c = mul(b,a);
        System.out.println(c);
        
    }
}
