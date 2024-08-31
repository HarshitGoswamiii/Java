public class array1 {
    public static void main(String[] args){
        int[] arr={10,22,35,25,13,43};
        int sum = 0;
        int avg=arr.length;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Sum : "+sum);
        System.out.println("Avg : "+sum/avg);
    }
}
