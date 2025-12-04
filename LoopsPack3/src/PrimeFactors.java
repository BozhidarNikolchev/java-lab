import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nonPrime = Integer.parseInt(scanner.nextLine());

        while (nonPrime != 1) {
            for (int i = 2; i <= nonPrime; i++) {
                if (nonPrime % i == 0) {
                    nonPrime /= i;
                    System.out.println(i);
                    break;
                }
            }
        }





    }
}
