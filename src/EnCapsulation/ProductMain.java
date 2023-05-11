package EnCapsulation;

public class ProductMain {
    public static void main(String[] args) {
        Product p1=new Product();
        p1.setProductId(101);
        int id=p1.getProductId();
        System.out.println(id);
        p1.setProductName("Laptop");
        String name=p1.getProductName();
        System.out.println(name);



    }
}
