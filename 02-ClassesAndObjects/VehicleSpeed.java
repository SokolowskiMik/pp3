public class VehicleSpeed {

    public static void main(String[] args) {
        int vehicleSpeed = 158;
        int lowerSpeedLimit = 40;
        int higherSpeedLimit = 140; 

        if (vehicleSpeed <= higherSpeedLimit && vehicleSpeed >= lowerSpeedLimit) {
            System.out.println("Vehicle speed: " + vehicleSpeed);
            System.out.println("Speed is valid: True" );
        }
        else {
            System.out.println("Vehicle speed: " + vehicleSpeed);
            System.out.println("Speed is valid: False" ); 
        }
    }
}
