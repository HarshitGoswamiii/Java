public class array2 {
    public static void main(String[] args){
        String str = "Harshit Goswami";
        int repeat = 0;
        char ch='i';
        for(int i = 0 ; i<str.length();i++){
            if(ch == str.charAt(i)){
                repeat +=i;
            }
        }
        System.out.println("Frequency : "+repeat);
    }
}
