import java.util.Scanner;

public class WeekendOrWorkingDay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputDay = scanner.nextLine();

        String day = "";

        switch (inputDay) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                day = "Working day";
                break;
            case "Saturday":
            case "Sunday":
                day = "Weekend";
                break;
            default:
                day = "Error";
                break;
        }

        System.out.println(day);
    }
}
