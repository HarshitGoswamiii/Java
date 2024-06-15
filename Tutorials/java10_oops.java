public class java10_oops {

    class person{
        String name;
        int age;
        int height;
        public void  getdetails(){
            System.out.println("Age : " + age);
            System.out.println("name : " + name);
            System.out.println("Height : " + height);
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
         System.out.println(Harshit.getdetails());
    }
}
