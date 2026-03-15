package auca.Exercise;

public class ConvertCelsiusToFahrenheitAndKelvin {
    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
    }
}
