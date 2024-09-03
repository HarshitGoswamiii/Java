public class gcd {
    public static void main(String[] args){
        int num1=86,num2=172;
        int GCD = 1;
        for(int i=0; i<= num1 && i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                GCD=i;
            }
        }
        System.out.println("GCD of "+num1+" And "+num2+" : "+GCD);
    }
}
