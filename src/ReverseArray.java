import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] array = input.split(" ");

        ArrayList<String> reversedArray = new ArrayList<>();

        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray.add(array[i]);
        }

        String resultArray = String.join(", ", reversedArray);

        System.out.println(resultArray);


    }
}
