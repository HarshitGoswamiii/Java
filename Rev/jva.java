
public class jva {
    static int fac(int num){
        if(num>=1){
            return num = num*fac(num-1);
        }
        else{
            return 1;
        }
        }
    
    public static void main(String[] args) {
        int n=5;
        System.out.println(fac(n));
    }
}
