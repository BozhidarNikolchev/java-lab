import java.util.Scanner;

public class Time {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();

        int daysToSec = ((days * 24) * 60) * 60;
        int hoursToSec = (hours * 60) * 60;
        int minutesToSec = minutes * 60;

        int secondsSum = daysToSec + hoursToSec + minutesToSec + seconds;

        System.out.println(secondsSum);

    }
}
