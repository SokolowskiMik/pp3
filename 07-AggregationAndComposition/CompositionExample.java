public class CompositionExample {
    public static void main(String[] args) {
        // Create a Processor object
        Processor processor = new Processor("Intel i7");

        // Create a Computer object with the Processor
        Computer myComputer = new Computer("Dell", processor);

        // Perform actions
        myComputer.start();
        myComputer.getProcessor().calculate();  // Accessing Processor's method through Computer
        myComputer.shutdown();
    }
}