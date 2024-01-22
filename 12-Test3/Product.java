
public class Product implements Comparable<Product> {
    private String name;
    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product otherProduct) {
        // Sort in descending order based on product price
        return Float.compare(otherProduct.getPrice(), this.price);
    }

    @Override
    public String toString() {
        return "Product{" +
               "name='" + name + '\'' +
               ", price=" + price +
               '}';
    }
}
