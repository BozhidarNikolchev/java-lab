import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String outputProduct = "";

        switch (product) {
            case "banana", "apple", "kiwi", "cherry", "lemon", "grapes" -> outputProduct = "fruit";
            case "tomato", "cucumber", "pepper", "carrot" -> outputProduct = "vegetable";
            default -> outputProduct = "unknown";
        }

        System.out.println(outputProduct);

    }
}
