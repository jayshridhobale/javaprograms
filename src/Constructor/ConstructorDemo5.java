package Constructor;

class Product{
    int productId;
    String productName;
    double productPrice;

    Product(int id,String name,double price){
        productId=id;
        productName=name;
        productPrice=price;
    }
    void display(){
        System.out.println(productId+ "\t" +productName+ "\t" +productPrice);
    }
}
public class ConstructorDemo5 {
    public static void main(String[] args) {
        Product p1=new Product(101,"Tv",20000.23);
        p1.display();
        Product p2=new Product(102,"Laptop",30000.23);
        p2.display();


    }
}
