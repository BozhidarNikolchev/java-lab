import java.util.Scanner;

public class BeerTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String time = scanner.nextLine();

        if (time.length() != 7) {
            if (time.length() != 8) {
                System.out.println("invalid time");
            }
        }

        if (time.length() == 7) {
            String oneDigitInputTime = time.substring(0, 1);
            String oneDigitInputAmOrPm = time.substring(5, 6);

            double result;
            try {
                result = Double.parseDouble(oneDigitInputTime);

            } catch (NumberFormatException e) {
                System.out.println("invalid time");
                return;
            }

            if (oneDigitInputAmOrPm.equals("P")) {
                switch (oneDigitInputTime) {
                    case "1":
                    case "2":
                    case "3":
                    case "4":
                    case "5":
                    case "6":
                    case "7":
                    case "8":
                    case "9":
                        System.out.println("beer time");
                        break;
                }


            } else if (oneDigitInputAmOrPm.equals("A")) {
                switch (oneDigitInputTime) {
                    case "1":
                    case "2":
                        System.out.println("beer time");
                        break;
                }

                switch (oneDigitInputTime) {
                    case "3":
                    case "4":
                    case "5":
                    case "6":
                    case "7":
                    case "8":
                    case "9":
                        System.out.println("non-beer time");
                        break;
                }

            }
        }


        if (time.length() == 8) {
            String twoDigitsInputTime = time.substring(0, 2);
            String twoDigitsInputAmOrPm = time.substring(6, 7);

            double result;
            try {
                result = Double.parseDouble(twoDigitsInputTime);

            } catch (NumberFormatException e) {
                System.out.println("invalid time");
                return;
            }

            if (twoDigitsInputAmOrPm.equals("P")) {
                switch (twoDigitsInputTime) {
                    case "10":
                    case "11":
                        System.out.println("beer time");
                        break;
                    case "12":
                        System.out.println("non-beer time");
                        break;
                }


            } else if (twoDigitsInputAmOrPm.equals("A")) {
                switch (twoDigitsInputTime) {
                    case "10":
                    case "11":
                        System.out.println("non-beer time");
                        break;
                    case "12":
                        System.out.println("beer time");
                        break;
                }


            }
        }

    }
}
