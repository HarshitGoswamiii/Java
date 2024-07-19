public class array {
    public static void main(String[] args) {
        // int[] arr={98,76,87,76};
    //     float sum=0;
    //     for(float element:arr){
    //         // System.out.println(element);
    //         sum +=element;
    //     }
    //     System.out.println(sum);

    // int a=70;
    // boolean avail=false;
    // for(int element:arr){
    //     if(a==element){
    //         avail=true;
    //         break;
    //     }     
    //     }
    // if(avail){
    //     System.out.println("Present");
    //     }
    // else{
    //     System.out.println("Not Present");
    //     }

    int[] physics={70,80,87,78};
    float sum =0;
    for(int element:physics){
        sum += element;
    }
    System.out.println(sum/physics.length);
    }
}