public class Product {
    private String name;
    private boolean isVegetarian;

    public String getName() {
        return name;
    }
    public boolean getIsVegetarian() {
        return isVegetarian;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.setName("obwarzan");
        p.setVegetarian(false);
        System.out.println(p.getName() + " " + p.getIsVegetarian());
    }
}
