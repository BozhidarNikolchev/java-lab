import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nightsCount = Integer.parseInt(scanner.nextLine());

        double studioPrice = nightsCount * 50;
        double apartmentPrice = nightsCount * 65;

        switch (month) {
            case "May":
            case "October":
                studioPrice = nightsCount * 50;
                apartmentPrice = nightsCount * 65;

                if (nightsCount > 7 && nightsCount <= 14) {
                    studioPrice = studioPrice - (studioPrice * 0.05);

                } else if (nightsCount > 14) {
                    studioPrice = studioPrice - (studioPrice * 0.30);
                    apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
                }
                break;

            case "June":
            case "September":
                studioPrice = nightsCount * 75.20;
                apartmentPrice = nightsCount * 68.70;

                if (nightsCount > 14) {
                    studioPrice = studioPrice - (studioPrice * 0.20);
                    apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
                }
                break;

            case "July":
            case "August":
                studioPrice = nightsCount * 76;
                apartmentPrice = nightsCount * 77;

                if (nightsCount > 14) {
                    apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);

                }

                break;
        }

        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
