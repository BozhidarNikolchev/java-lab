import java.util.Scanner;

public class BasketballEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int annualFee = Integer.parseInt(scanner.nextLine());

        double basketballSneakers = annualFee - (annualFee * 0.40);
        double basketballSportsSuit = basketballSneakers - (basketballSneakers * 0.20);
        double basketBall = basketballSportsSuit * 1/4;
        double basketballAccessories = basketBall * 1/5;

        double annualBasketballFee = annualFee + basketballSneakers + basketballSportsSuit + basketBall + basketballAccessories;


        System.out.println(annualBasketballFee);
    }
}

