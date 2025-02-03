import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String genderIdentifier = scanner.nextLine();

        if (age >= 16) {
            if (genderIdentifier.equals("m")) {
                System.out.println("Mr.");

            } else if (genderIdentifier.equals("f")) {
                System.out.println("Ms.");

            }

        } else if (age < 16) {
            if (genderIdentifier.equals("m")) {
                System.out.println("Master");

            } else if (genderIdentifier.equals("f")) {
                System.out.println("Miss");

            }
        }
    }
}
