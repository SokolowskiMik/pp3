public class Lamp {
    boolean isOn = false;

    void SwitchOn() {
        isOn = true;
    }

    void SwitchOff() {
        isOn = false;
    }

    void LampStatus() {
        String status = (isOn) ? "Lamp is on" : "Lamp is off";
        System.out.println(status);
    }

}
