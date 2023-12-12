import java.util.*;
public class C4 {

    public static void main(String[] args) {
        Product milk = new Product("milk",2);
        Product apple = new Product("apple",4);
        C4 c = new C4();
        c.add(milk);
        c.add(apple);

        System.out.println(c.toString());
        System.out.println(c.total());
    }

    private List<Product> products;

    public C4() {
        this.products = new ArrayList<>();
    }
    
    public void add(Product product) {
        this.products.add(product);
    }

    @Override
    public String toString() {
        List<String> names = new ArrayList<>();
        for (Product p:this.products) {
            names.add(p.getName());
        }
        return String.join(",",names);
    }

    public int total() {
        int sum = 0;
        for (Product p: this.products) {
            sum += p.getQuantity();
        }
        return sum;
    }

    
}
