public class TV implements CanOnOff {
    private boolean isOn;

    public TV() {
        this.isOn = false;
    }

    @Override
    public void on() {
        if (!isOn) {
            System.out.println("Turning on the TV.");
            isOn = true;
        } else {
            System.out.println("The TV is already on.");
        }
    }
    @Override
    public void off() {
        if (isOn) {
            System.out.println("Turning off the TV.");
            isOn = false;
        } else {
            System.out.println("The TV is already off.");
        }
    }

    public static void main(String[] args) {
        // Example usage of the TV class implementing CanOnOff interface
        TV myTV = new TV();
        myTV.on();   // Turn on the TV
        myTV.off();  // Turn off the TV
        myTV.off();  // Try turning off again (already off)
        myTV.on();   // Turn on the TV again
    }
}
