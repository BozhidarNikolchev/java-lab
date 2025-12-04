import java.util.Scanner;

public class PrintCompanyInformation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String companyName = scanner.nextLine();
        String address = scanner.nextLine();
        String phoneNumber = scanner.nextLine();
        String fax = scanner.nextLine();
        String webSite = scanner.nextLine();
        String managersFirstName = scanner.nextLine();
        String managersLastName = scanner.nextLine();
        String managersAge = scanner.nextLine();
        String managersPhoneNumber = scanner.nextLine();

        System.out.printf("%s" +
                "%nAddress: %s" +
                "%nTel. %s" +
                "%nFax: %s" +
                "%nWeb site: %s" +
                "%nManager: %s " +
                "%s (age: %s, tel. %s)", companyName, address, phoneNumber, fax, webSite, managersFirstName, managersLastName, managersAge, managersPhoneNumber);


    }
}
