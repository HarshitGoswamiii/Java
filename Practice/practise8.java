class Employee { // Practice 1
    int salary;
    String name;

    public void getsalary() {
        salary = salary * 1000;
        System.out.println(salary);
    }

    public void getname() {
        System.out.println(name);
    }

    public void setname(String n) {
        name = n;
    }
}

class square { // Practice 3
    int side;

    public void parameter() {
        System.out.println("Parameter : " + (side * 4));
    }

    public void area() {
        System.out.println("Area : " + (side * side));
    }
}

class rectangle{ // Practice 4
    int l;
    int b;

    public void parameter() {
        System.out.println("Parameter : " + ((l+b)*2));
    }

    public void area() {
        System.out.println("Area : " + (l * b));
    }
}

public class practise8 {
    public static void main(String[] args) {

        // Practice 1 --------->>
        Employee harshit = new Employee();
        harshit.salary = 12;
        // harshit.setname("Harshit Goswami");
        // harshit.getname();
        // harshit.getsalary();

        // Practice 3 ---------->>
        square a = new square();
        a.side = 5;
        // a.area();
        // a.parameter();

        // Practice 4 --------->>
        rectangle r = new rectangle();
        // r.l=10;
        // r.b=5;
        // r.area();
        // r.parameter();

        //  Practice 5 --------->>
        
    }
}
