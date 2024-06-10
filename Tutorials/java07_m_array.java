public class java07_m_array {
    public static void main(String[] args) {

        // int[] arr;
        int[][][] flat;
        flat = new int[2][3][3];
        flat[0][0][0] = 100;
        flat[0][0][1] = 101;
        flat[0][0][2] = 102;
        flat[0][1][0] = 200;
        flat[0][1][1] = 201;
        flat[0][1][2] = 202;
        flat[0][2][0] = 100;
        flat[0][2][1] = 101;
        flat[0][2][2] = 102;       
             flat[0][0][0] = 100;
        flat[0][0][1] = 101;
        flat[0][0][2] = 102;
        flat[0][1][0] = 200;
        flat[0][1][1] = 201;
        flat[0][1][2] = 202;
        flat[0][2][0] = 100;
        flat[0][2][1] = 101;
        flat[0][2][2] = 102;        
            flat[0][0][0] = 100;
        flat[0][0][1] = 101;
        flat[0][0][2] = 102;
        flat[0][1][0] = 200;
        flat[0][1][1] = 201;
        flat[0][1][2] = 202;
        flat[0][2][0] = 100;
        flat[0][2][1] = 101;
        flat[0][2][2] = 102;
        for (int i = 0; i < flat.length; i++) {
            for (int j = 0; j < flat[i].length; j++) {
                for (int k = 0; k = flat[j][k]; k++) {
                    System.out.print(flat[i][j][k]);
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
