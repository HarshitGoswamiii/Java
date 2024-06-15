public class java10_oops {

    class Person {
        String name;
        int age;
        int height;

        public void getdetails() {
            System.out.println("Age : " + age);
            System.out.println("name : " + name);
            System.out.println("Height : " + height);
        }

    }

    public static void main(String[] args) {
        Person harshit = new Person();
        harshitarshit.age = 18;
        harshitarshit.height = 6;
        harshitarshit.name = "Harshit Goswami";
        Person manjeet = new Person();
        manjeet.age = 18;
        manjeet.height = 6;
        manjeet.name = "Manjeet";
        harshit.getdetails();
    }
}
