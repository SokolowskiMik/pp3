public class Temperatures {
    public int celsiusToKelvin(int celsius) {
        int kelvin;
        kelvin = celsius+273;
        return kelvin;
    }
    public int kelvinTocelsius(int kelvin) {
        int celsius;
        celsius = kelvin-273;
        return celsius;
    }

    public double celsiusToFahrenheit(int celsius) {
        double fahrenheit = celsius * (9.0/5.0) + 32;
        return fahrenheit;
    }
}
