public class power {
    static int powercalc(int base, int powerraised){
        if(powerraised !=0){
            return (base*powercalc(base, powerraised-1));
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args){
        int base1 = 3, powerraised1=4;
        System.out.println(powercalc(base1, powerraised1));
    }
}
