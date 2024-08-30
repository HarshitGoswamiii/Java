public class java {
    public static void main(String[] args) {
        int a =10,n1=0,n2=1;
        System.out.println("Fibonicci Series until "+a+" : ");
        for(int i=1;i<=a;++i){
            System.out.print(n1+", ");
            int next = n1+n2;
            n1=n2;
            n2=next;
        }
    }
}