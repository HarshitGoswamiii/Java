class details{
    int roll_no;
    String name;
    int salary;
    public void printdetail(){
        System.out.print("My Id is "+roll_no);
        System.out.print(" and my name is "+name);
    }
    public void  getsalary(){
        salary = salary*1000;
        System.out.print(" and my salary is "+salary);
    }
}
public class java11_oops {
    public static void main(String[] args){
        details harshit = new details();
        harshit.roll_no=19;
        harshit.salary=12;
        harshit.name="Harshit Goswami";
        harshit.printdetail();
        harshit.getsalary();
        // System.out.println(harshit.roll_no);
        // System.out.println(harshit.name);

    }
}
