import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayName = scanner.nextLine();
        int ticketPrice = 0;

        switch (dayName) {
            case "Monday", "Tuesday", "Friday" -> ticketPrice = 12;
            case "Wednesday", "Thursday" -> ticketPrice = 14;
            case "Saturday", "Sunday" -> ticketPrice = 16;
        }

        System.out.println(ticketPrice);
    }
}
