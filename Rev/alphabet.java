public class alphabet {
    public static void main(String[] args) {
        String str = "this Website 143 Is Awesome 12";
        String str1=str.toLowerCase();
        int vowels = 0, consonant = 0, digit = 0, blank = 0;
        for(int i=0; i<str1.length();i++){
            char ch=str1.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels++;
            }
            else if(ch>='a' && ch<='z'){
                consonant++;
            }
            else if(ch>='0' && ch<='9'){
                digit++;
            }
            else{
                blank++;
            }
        }
        System.out.println("Vowels : "+vowels);
        System.out.println("Consonant : "+consonant);
        System.out.println("Digits : "+digit);
        System.out.println("Blanks : "+blank);
    }
}
