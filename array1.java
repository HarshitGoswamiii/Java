public class array1 {
    public static void main(String[] args){
        int[] arr={10,22,35,25,13,43};
        int sum = 0;
        for(int i = 0;i<=arr.length;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
