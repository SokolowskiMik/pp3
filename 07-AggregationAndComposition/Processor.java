
public class Processor {
    private String model;

    public Processor(String model) {
        this.model = model;
    }

    public void calculate() {
        System.out.println("Performing calculations with " + model + " processor.");
    }
}