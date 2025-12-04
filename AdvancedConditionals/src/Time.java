import java.util.Scanner;

public class Time {

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         double days = scanner.nextDouble();
         double hours = scanner.nextDouble();
         double minutes = scanner.nextDouble();
         double seconds = scanner.nextDouble();

         double daysToSeconds = days * (24 * 60 * 60);
         double hoursToSeconds = hours * (60 * 60);
         double minutesToSeconds = minutes * 60;

         double totalSeconds = daysToSeconds + hoursToSeconds + minutesToSeconds + seconds;

         System.out.printf("%.0f", totalSeconds);

    }
}
