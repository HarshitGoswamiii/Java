public class Interval {
    static boolean prime(int num){
        boolean flag = false;
        for(int i =2; i<=num/2;++i){
            if(num%i==0){
                flag=true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args){
        int num =20,last=50;
        while(num<last){
            if(prime(num)){
                System.out.print(num+" ");
                ++num;
            }
        }
    }
}
