import java.util.Scanner;

public class FindLargestThreeValues {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int largest = -500;
        int secondLargest = -500;
        int thirdLargest = -500;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = number;


            } else if (number > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = number;


            } else if (number > thirdLargest) {
                thirdLargest = number;
            }
        }

        System.out.printf("%d, %d and %d", largest, secondLargest, thirdLargest);

    }
}
