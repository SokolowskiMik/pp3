public class ShoppingListExample {
    public static void main(String[] args) {
        // Create a shopping list
        ShoppingList myShoppingList = new ShoppingList();

        // Display the list of products (empty)
        myShoppingList.displayList();

        // Display the number of products to be purchased (0)
        System.out.println("Number of products to be purchased: " + myShoppingList.getNumberOfProducts());

        // Add three products to the shopping list
        // myShoppingList.addProduct("Milk");
        // myShoppingList.addProduct("Bread");
        // myShoppingList.addProduct("Eggs");
        myShoppingList.addProduct();
        myShoppingList.addProduct();
        // Display the list of products
        myShoppingList.displayList();

        myShoppingList.addProduct();

        // Display the number of products to be purchased (3)
        System.out.println("Number of products to be purchased: " + myShoppingList.getNumberOfProducts());

        // Add one more product to the shopping list
        // myShoppingList.addProduct("Cheese");

        // Display the list of products
        myShoppingList.displayList();

        // Display the number of products to be purchased (4)
        System.out.println("Number of products to be purchased: " + myShoppingList.getNumberOfProducts());
    }
}