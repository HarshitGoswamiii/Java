public class java10_oops {

    class person{
        String name;
        int age;
        int height;
        public void getage(){
            System.out.println("Age : " + age);
        }

    }
    public static void main(String[] args) {
        person Harshit = new person();
        Harshit.age = 18;
        Harshit.height= 6;
        Harshit.name="Harshit Goswami";
        person manjeet = new person();
        manjeet.age = 18;
        manjeet.height= 6;
        manjeet.name="Manjeet";       
        
    }
}
