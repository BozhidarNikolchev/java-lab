import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int countOfProccessors = Integer.parseInt(scanner.nextLine());
        int countOfWorkers = Integer.parseInt(scanner.nextLine());
        int workingDays = Integer.parseInt(scanner.nextLine());

        int workingHours = countOfWorkers * workingDays * 8;
        double madeProccessors = Math.floor(workingHours / 3.0);

        if (madeProccessors > countOfProccessors) {
            double diff = countOfProccessors - madeProccessors;
            System.out.printf("Profit: -> %.2f BGN", Math.abs(diff * 110.10));

        } else if (madeProccessors == countOfProccessors) {
            System.out.printf("Profit: -> %.2f BGN", madeProccessors * 110.10);

        } else {
            double diff = countOfProccessors - madeProccessors;
            System.out.printf("Losses: -> %.2f BGN", diff * 110.10);
        }


    }
}
