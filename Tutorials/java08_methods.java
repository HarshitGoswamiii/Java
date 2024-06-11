public class java08_methods {
    static int sum(int x, int y){
    int z;
    z=x+y;
    return z;
    }
    public static void main(String[] args){
        int a=10;
        int b=12;
        int c;
        c=sum(a,b);
        System.out.println("Addition : "+c);
    }
}
