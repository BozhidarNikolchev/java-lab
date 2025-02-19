import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examHourToMinutes = examHour * 60;
        int arrivalHourToMinutes = arrivalHour * 60;

        int examTime = examHourToMinutes + examMinutes;
        int arrivalTime = arrivalHourToMinutes + arrivalMinutes;

        if (arrivalTime > examTime) {
            System.out.println("Late");
            int difference = arrivalTime - examTime;

            if (difference <= 59) {
                System.out.printf("%d minutes after the start", difference);

            } else {
                int hours = difference / 60;
                int minutes = difference % 60;

                if (minutes < 10) {
                    System.out.printf("%d:0%d hours after the start", hours, minutes);

                } else {
                    System.out.printf("%d:%d hours after the start", hours, minutes);
                }
            }

        } else if (arrivalTime == examTime) {
            System.out.println("On time");

        } else {
            int difference = examTime - arrivalTime;
            int hours = difference / 60;
            int minutes = difference % 60;

            if (difference < 60) {
                if (difference <= 30) {
                    System.out.println("On time");
                    System.out.printf("%d minutes before the start", minutes);

                } else {
                    System.out.println("Early");
                    System.out.printf("%d minutes before the start", minutes);
                }

            } else {
                System.out.println("Early");

                if (minutes < 10) {
                    System.out.printf("%d:0%d hours before the start", hours, minutes);

                } else {
                    System.out.printf("%d:%d hours before the start", hours, minutes);

                }
            }
        }


    }
}