import java.util.Scanner;

public class Tips {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double mealPrice = Double.parseDouble(scanner.nextLine());

        double tip = mealPrice * 0.10;
        double result = mealPrice + tip;

        System.out.println((int)result);


    }
}
