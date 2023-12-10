import java.util.*;

public class ShoppingList {
    private ArrayList<String> list;

    public ShoppingList() {
        this.list = new ArrayList<>();
    }

    public void addProduct(String product) {
        this.list.add(product);
    }

    public void addProduct() {
        Scanner s = new Scanner(System.in);
        System.out.println("Type the name of the product: ");
        String nextProduct = s.nextLine();
        this.addProduct(nextProduct);
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public void displayList() {
        System.out.println("Products in the shopping list:");
        for (String product : list) {
            System.out.println("- " + product);
        }
        System.out.println();
    }

    public int getNumberOfProducts() {
        return list.size();
    }

    
}
