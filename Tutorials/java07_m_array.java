public class java07_m_array {
    public static void main(String[] args) {
        
        // int[] arr;
        int[][][] flat;
        flat=new int[2][3][3];
        flat[0][0][0]=100;
        flat[0][0][1]=101;
        flat[0][0][2]=102;
        flat[0][0][0]=100;
        flat[0][0][1]=101;
        flat[0][0][2]=102;
        flat[0][0][0]=100;
        flat[0][0][1]=101;
        flat[0][0][2]=102;
        flat[1][0]=201;
        flat[1][1]=202;
        flat[1][2]=203;
        for(int i=0; i<flat.length ; i++){
            for(int j =0 ; j < flat[i].length; j++){
                System.out.print(flat[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
