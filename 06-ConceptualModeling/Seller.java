import java.util.*;

public class Seller {


    public static void main(String[] args) {
        Seller s = new Seller("adfa", "bbbb","aaa", new String[]{"a","b","c"});
        System.out.println(s.viewProducts());
        System.out.println(s.sellProduct("a"));
    }


    private String name;
    private String contactNumber;
    private String address;
    private List<String> products;

    


    public Seller(String name, String contactNumber, String address, String[] products) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;
        this.products = new ArrayList<>(Arrays.asList(products));
    }
    public String viewProducts() {
        return String.join(",",this.products).trim();
    }

    public String sellProduct(String product) {
        int index = this.products.indexOf(product);
        return String.format("Product %s sold by %s", this.products.get(index), this.name);
    }
    
}
