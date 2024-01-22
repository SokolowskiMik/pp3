public class Pizza extends Food implements Extra{
    private int size;

    public Pizza(String name, int size) {
        super(name);
        this.size = size;
        setPrice();
    }
    
    @Override
    public void setPrice() {
        // Set the price of the pizza based on its size
        this.price = this.size - 10;
    }

    @Override
    public float discount() {
        // Returns the discount for the pizza
        if (this.price >= 30) {
            return this.price * 0.05f;  // 5% discount
        } else {
            return 0;
        }
    }


    @Override
    public float delivery() {
        // Returns the cost of pizza delivery
        float deliveryCost = (this.size >= 50) ? 8 : 6;
        return deliveryCost;
    }
    
    @Override
    public float delivery(int tip) {
        // Returns the cost of pizza delivery
        float deliveryCost = (this.size >= 50) ? 8 : 6;
        return deliveryCost + tip;
    }
}
