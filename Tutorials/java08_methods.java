public class java08_methods {
    static int sum(int x, int y){
    int z;
    z=x+y;
    return z;
    }
    static int diff(int x, int y){
        int z;
        z=x-y;
        return z;
        }
    public static void main(String[] args){
        int a=10;
        int b=12;
        int c;
        int c1;
        c=sum(a,b);
        System.out.println("Addition : "+c);
        c1=diff(a,b);
        System.out.println("Addition : "+c1);
    }
}
