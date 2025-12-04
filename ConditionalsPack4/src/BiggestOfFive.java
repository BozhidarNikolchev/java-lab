import java.util.Scanner;

public class BiggestOfFive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int fourthNum = Integer.parseInt(scanner.nextLine());
        int fifthNum = Integer.parseInt(scanner.nextLine());

        int biggestNum = Math.max(firstNum, Math.max(secondNum, Math.max(thirdNum, Math.max(fourthNum, fifthNum))));

        System.out.println(biggestNum);


    }
}
