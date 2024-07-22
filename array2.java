public class array2 {
    public static void main(String[] args) {
      
        int[] red = {1,2,3,4,5};
        int l = red.length;
        int temp;
        int n = Math.floorDiv(l, 2);
        for(int i =0; i<=n;i++){
            temp = red[i];
            red[i]= red[l-i-1];
            red[l-i-1] = temp;

        }
        for(int element: red){
            System.out.print(element+" ");
        }
    }}