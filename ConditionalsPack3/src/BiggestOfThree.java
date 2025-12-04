import java.util.Scanner;

public class BiggestOfThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int biggestNum = Math.max(firstNum, Math.max(secondNum, thirdNum));

        System.out.println(biggestNum);

    }
}
