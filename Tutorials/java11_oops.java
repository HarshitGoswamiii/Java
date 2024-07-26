class details{
    int roll_no;
    String name;
    int salary;
    public void printdetail(){
        System.out.println(roll_no);
        System.out.println(name);
    }
    public void  getsalary(){
        salary = salary*1000;
        System.out.println(salary);
    }
}
public class java11_oops {
    public static void main(String[] args){
        details harshit = new details();
        harshit.roll_no=19;
        harshit.name="Harshit Goswami";
        harshit.printdetail();
        // System.out.println(harshit.roll_no);
        // System.out.println(harshit.name);

    }
}
