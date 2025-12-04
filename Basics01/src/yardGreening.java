import java.util.Scanner;

public class yardGreening {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double squireMeters = Double.parseDouble(scanner.nextLine());

        double squireMetersPrice = squireMeters *  7.61;
        double discount = squireMetersPrice * 0.18;

        double finalPrice = squireMetersPrice - discount;

        System.out.printf("The final price is: %f lv. %n The discount is: %f lv.", finalPrice, discount);

    }
}
