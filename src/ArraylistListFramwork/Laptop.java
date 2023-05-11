package ArraylistListFramwork;

public class Laptop {


    double price;
    String company;
    public Laptop(double price, String company) {
        this.price = price;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                ", company='" + company + '\'' +
                '}';
    }
}
