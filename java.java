public class java {
    public static void main(String[] args) {
        int a =10,n1=0,n2=1;
        System.out.print("Fibonicci Series until "+a+" : ");
        int next = n1+n2;
        n1=n2;
        n2=next;
        System.out.println(next);
        for(int i=1;i<=a;++i){
            System.out.print(", "+next);
        }
    }
}