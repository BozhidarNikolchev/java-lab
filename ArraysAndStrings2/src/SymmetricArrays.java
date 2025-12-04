import java.util.Scanner;

public class SymmetricArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arraysCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arraysCount; i++) {
            String input = scanner.nextLine();
            String[] array = input.split(" ");

            int[] numbers = new int[array.length];

            for (int j = 0; j < array.length; j++) {
                numbers[j] = Integer.parseInt(array[j]);
            }

            int middle = numbers.length / 2;

            int[] firstHalf = new int[middle];
            int[] secondHalf = new int[numbers.length - middle];

            for (int j = 0; j < middle; j++) {
                firstHalf[j] = numbers[j];
            }

            for (int j = middle; j < numbers.length; j++) {
                secondHalf[j - middle] = numbers[j];
            }

            boolean isSymmetric = true;

            for (int j = 0; j < firstHalf.length; j++) {
                if (firstHalf[j] != secondHalf[secondHalf.length - 1 - j]) {
                    isSymmetric = false;
                }
            }

            if (isSymmetric) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }


        }


    }
}
