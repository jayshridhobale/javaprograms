package EnCapsulation;

public class Product {
    private int productId;    //java bean class
    private  String productName;
    //read
    public int getProductId(){
        return productId;
    }
    //write
    public void setProductId(int productId){
        this.productId=productId;
    }
    //read
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }

}
