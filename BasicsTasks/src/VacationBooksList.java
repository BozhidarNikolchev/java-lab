import java.util.Scanner;

public class VacationBooksList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfPages = Integer.parseInt(scanner.nextLine());
        int pagesReadInOneHour = Integer.parseInt(scanner.nextLine());
        int daysToReadTheBook = Integer.parseInt(scanner.nextLine());

        int timeToReadOneBook = countOfPages / pagesReadInOneHour;
        int neededHoursPerDay = timeToReadOneBook / daysToReadTheBook;

        System.out.println(neededHoursPerDay);
    }
}

