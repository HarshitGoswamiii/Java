public class lcm {
    public static void main(String[] args) {
        int[] arr={10,29,33,21};
        int[] arr2={20,43,22,12};
        int[] sum = new int[arr.length];
        for(int i=0;i<arr.length;i++){
                sum[i]=arr[i]+arr2[i];
            }
        for (int num : sum) {
            System.out.print(num+" ");
        }
        }
    }
