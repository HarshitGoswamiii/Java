public class array1 {
    public static void main(String[] args){
        int[] arr={10,90,35,49,13,43};
        int largest = 0;
        for(int i = 0 ; i<arr.length;i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        System.out.println("Largest number : "+largest);
        // int sum = 0;
        // int avg=arr.length;
        // for(int i = 0;i<arr.length;i++){
        //     sum += arr[i];
        // }
        // System.out.println("Sum : "+sum);
        // System.out.println("Avg : "+sum/avg);
    }
}
