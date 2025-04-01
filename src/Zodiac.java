import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        int remainder = year % 12;
        String animal = "";

        switch (remainder) {
            case 0 -> animal = "Monkey";
            case 1 -> animal = "Rooster";
            case 2 -> animal = "Dog";
            case 3 -> animal = "Pig";
            case 4 -> animal = "Rat";
            case 5 -> animal = "Ox";
            case 6 -> animal = "Tiger";
            case 7 -> animal = "Hare";
            case 8 -> animal = "Dragon";
            case 9 -> animal = "Snake";
            case 10 -> animal = "Horse";
            case 11 -> animal = "Sheep";

        }

        System.out.println(animal);

    }
}

