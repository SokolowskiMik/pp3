public class TestLamps {
    public static void main(String[] args) {
        Lamp l = new Lamp();
        l.LampStatus();
        l.SwitchOn();
        l.LampStatus();

        Lamp l2 = new Lamp();
        l2.SwitchOn();
        l2.SwitchOff();
        l2.LampStatus();
    }
}
