import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());

        double firstYear = deposit + (deposit * 0.05);
        double secondYear = firstYear + (firstYear * 0.05);
        double thirdYear = secondYear + (secondYear * 0.05);

        System.out.printf("%.2f%n%.2f%n%.2f", firstYear, secondYear, thirdYear);

    }
}
