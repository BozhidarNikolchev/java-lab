import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfMovieScreening = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int seats = rows * columns;
        double result = 0;

        if (typeOfMovieScreening.equals("Premiere")) {
            result = seats * 12.00;

        } else if (typeOfMovieScreening.equals("Normal")) {
            result = seats * 7.50;

        } else if (typeOfMovieScreening.equals("Discount")) {
            result = seats * 5.00;

        }

        System.out.printf("%.2f leva", result);

    }
}
