
public class jva {
    static int add(int num){
        if(num!=0){
            return num+add(num-1);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int num1=5;
        System.out.println(add(num1));
       
    }
}
