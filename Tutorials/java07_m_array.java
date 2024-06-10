public class java07_m_array {
    public static void main(String[] args) {

        // int[] arr;
        int[][][] flat;
        flat = new int[3][3][3];
        flat[0][0][0] = 100;
        flat[0][0][1] = 101;
        flat[0][0][2] = 102;
        flat[0][1][0] = 200;
        flat[0][1][1] = 201;
        flat[0][1][2] = 202;
        flat[0][2][0] = 300;
        flat[0][2][1] = 301;
        flat[0][2][2] = 302;       
             flat[1][0][0] = 400;
        flat[1][0][1] = 401;
        flat[1][0][2] = 402;
        flat[1][1][0] = 500;
        flat[1][1][1] = 501;
        flat[1][1][2] = 502;
        flat[1][2][0] = 600;
        flat[1][2][1] = 601;
        flat[1][2][2] = 602;        
            flat[2][0][0] = 700;
        flat[2][0][1] = 701;
        flat[2][0][2] = 702;
        flat[2][1][0] = 800;
        flat[2][1][1] = 801;
        flat[2][1][2] = 802;
        flat[2][2][0] = 900;
        flat[2][2][1] = 901;
        flat[2][2][2] = 902;
        for (int i = 0; i < flat.length; i++) {
            for (int j = 0; j < flat[i].length; j++) {
                for (int k = 0; k < flat[i][j].length ; k++) {
                    System.out.print(flat[i][j][k]);
                    System.out.print(" ");
                }
                System.out.print("");
            }
            System.out.println("");
        }
    }
}
