class Employee{
    int salary;
    String name;
    public void getsalary(){
        salary = salary*1000;
        System.out.println(salary);
    }
    public void getname(){
        System.out.println(name);
    }
    public void setname(String n){
        name = n;
    }
}
public class practise8 {
    public static void main(String[] args) {

        // Practice 1 --------->>
        Employee harshit = new Employee();
        harshit.salary = 12;
        harshit.setname("Harshit Goswami");
        harshit.getname();
        harshit.getsalary();

        // Practice 2 ---------->>
        
    }
}
