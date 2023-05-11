package HierarchicalInheritance;

public class HirarchicalMain1 {
    public static void main(String[] args) {
       HR h1=new HR();
       h1.displayInfo(101,20000.23);
       h1.hiredEmployees();

        System.out.println("=========================");

        BusinessAnyalist b1=new BusinessAnyalist();
        b1.displayInfo(102,30000.32);
        b1.connectToClients();
    }
}
