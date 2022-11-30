package prob1;

public class Product implements Comparable<Product>{
    private   String  productName;
    private double productPrice;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        if(this.productPrice>product.productPrice){
            return 1;
        }else if(this.productPrice<product.productPrice){
            return -1;
        }else{
            return 0;
        }

    }
}
