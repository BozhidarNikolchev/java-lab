import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfAnimal = scanner.nextLine();

        String output = "";

        switch (typeOfAnimal) {
            case "dog" -> output = "mammal";
            case "crocodile", "tortoise", "snake" -> output = "reptile";
            default -> output = "unknown";
        }

        System.out.println(output);
    }
}
