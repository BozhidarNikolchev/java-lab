import java.util.Scanner;

public class GuessTheSeason {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int date = scanner.nextInt();

        String season = "";

        switch (month) {
            case "March":
                if (date >= 20) {
                    season = "Spring";
                }
                break;
            case "April":
            case "May":
                season = "Spring";
                break;
            case "June":
                if (date < 21) {
                    season = "Spring";
                }
                break;
        }

        switch (month) {
            case "June":
                if (date >= 21) {
                    season = "Summer";
                }
                break;
            case "July":
            case "August":
                season = "Summer";
                break;
            case "September":
                if (date < 22) {
                    season = "Summer";
                }
                break;
        }

        switch (month) {
            case "September":
                if (date >= 22) {
                    season = "Autumn";
                }
                break;
            case "October":
            case "November":
                season = "Autumn";
                break;
            case "December":
                if (date < 21) {
                    season = "Autumn";
                }
                break;
        }

        switch (month) {
            case "December":
                if (date >= 21) {
                    season = "Winter";
                }
                break;
            case "January":
            case "February":
                season = "Winter";
                break;
            case "March":
                if (date < 20) {
                    season = "Winter";
                }
                break;
        }


        System.out.println(season);

    }
}
