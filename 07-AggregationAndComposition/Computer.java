

public class Computer {
    private String brand;
    private Processor processor;  // Composition relationship

    public Computer(String brand, Processor processor) {
        this.brand = brand;
        this.processor = processor;
    }

    

    public Processor getProcessor() {
        return processor;
    }



    public void start() {
        System.out.println(brand + " computer is starting...");
    }

    public void shutdown() {
        System.out.println(brand + " computer is shutting down...");
    }
}