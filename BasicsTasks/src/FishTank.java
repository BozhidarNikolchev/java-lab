import java.util.Scanner;

public class FishTank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentageOfOccupiedSpace = Double.parseDouble(scanner.nextLine());

        int volume = length * width * height;
        double volumeInLitres = (double) volume / 1000;

        double neededLitres = volumeInLitres - (volumeInLitres * (percentageOfOccupiedSpace / 100));

        System.out.println(neededLitres);

    }
}

