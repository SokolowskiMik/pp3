import java.util.*;
public class Customer {
    private String name;
    private String contact;
    private String address;

    public Customer(String name, String contact, String address) {
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    public void buyProduct() {
        System.out.println("product bought by" + name);
    }
}
