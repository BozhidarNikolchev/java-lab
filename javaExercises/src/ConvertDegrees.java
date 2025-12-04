import java.util.Scanner;

public class ConvertDegrees {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String temperaturesInCelsius = scanner.nextLine();
        String[] splitTemperature = temperaturesInCelsius.split(" ");

        for (String temperature : splitTemperature) {
            int temperatureToNumber = Integer.parseInt(temperature);

            int degreesInFahrenheit = (temperatureToNumber * 9 / 5) + 32;
            System.out.println(degreesInFahrenheit);
        }

    }
}