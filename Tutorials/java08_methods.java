public class java08_methods {

    //Variable Arguement --------> VarArgs

    static int foo(int ...arr){
        int result=0;
        for(int a:arr){
            result -= a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Addition: " +foo(4,5,6));
        System.out.println("Addition: " +foo(4,5,6));
        System.out.println("Addition: " +foo(4,5,6,3,4,5));
        System.out.println("Addition: " +foo(4,5));
    }

    // Methods Overloading ------------>

    // static int sum(int x, int y){
    // int z;
    // z=x+y;
    // return z;
    // }
    // static int diff(int x, int y){
    //     int z;
    //     z=x-y;
    //     return z;
    //     }
    // public static void main(String[] args){
    //     int a=10;
    //     int b=12;
    //     int c;
    //     int c1;
    //     c=sum(a,b);
    //     System.out.println("Addition : "+c);
    //     c1=diff(a,b);
    //     System.out.println("Addition : "+c1);
    // }
}
