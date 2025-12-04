import java.util.ArrayList;
import java.util.Scanner;

public class ThreeGroups {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] numsArray = input.split(" ");

        int[] numbers = new int[numsArray.length];

        for (int i = 0; i < numsArray.length; i++) {
            numbers[i] = Integer.parseInt(numsArray[i]);
        }

        ArrayList<Integer> group0 = new ArrayList<>();
        ArrayList<Integer> group1 = new ArrayList<>();
        ArrayList<Integer> group2 = new ArrayList<>();

        for (int num : numbers) {

            if (num % 3 == 0) {
                group0.add(num);

            } else if (num % 3 == 1) {
                group1.add(num);

            } else if (num % 3 == 2) {
                group2.add(num);
            }
        }

        for (int num : group0) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int num : group1) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int num : group2) {
            System.out.print(num + " ");
        }
        System.out.println();


    }
}