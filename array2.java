public class array2 {
    public static void main(String[] args) {
      
        // int l = red.length;
        // int temp;
        // int n = Math.floorDiv(l, 2);
        // for(int i =0; i<=n;i++){
            //     temp = red[i];
            //     red[i]= red[l-i-1];
            //     red[l-i-1] = temp;
            
            // }
            // for(int element: red){
                //     System.out.print(element+" ");
                // }
                
        int[] red = {1,2,3,4,5};
        int max=0;
        int min=0;
        for(int e:red){
            if(e>max){
                max=e;
            }
            else if(e<min){
                min=e;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }}