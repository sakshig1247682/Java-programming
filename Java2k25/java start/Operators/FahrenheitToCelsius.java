//create a program  to convert Fahrenheit to Celsius

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Fahrenheit: ");
        float fahrenheit = scanner.nextFloat();
        
        float celsius = (fahrenheit - 32) * 5/9;
        
        System.out.println("Temperature in Celsius is: " + celsius +"C");

    }
}
