public class palindrome2 {
    public static void main(String[] args) {
        int num=123321;
        int reverse = 0;
        int count=0;
        for(;num!=0;num/=10,++count){
            ++count;
        }
        System.out.println(count);
    }
}
