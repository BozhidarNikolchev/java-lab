import java.text.DecimalFormat;
import java.util.Scanner;

public class DigitAsWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String dayNumber = scanner.nextLine();

        String day = "";

        if (dayNumber.equals("0")) {
            day = "zero";
        } else if (dayNumber.equals("1")) {
            day = "one";
        } else if (dayNumber.equals("2")) {
            day = "two";
        } else if (dayNumber.equals("3")) {
            day = "three";
        } else if (dayNumber.equals("4")) {
            day = "four";
        } else if (dayNumber.equals("5")) {
            day = "five";
        } else if (dayNumber.equals("6")) {
            day = "six";
        } else if (dayNumber.equals("7")) {
            day = "seven";
        } else if (dayNumber.equals("8")) {
            day = "eight";
        } else if (dayNumber.equals("9")) {
            day = "nine";
        } else {
            day = "not a digit";
        }

        System.out.println(day);
    }
}
