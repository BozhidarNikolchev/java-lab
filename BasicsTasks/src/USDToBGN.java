import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {

        Scanner usdCurrency = new Scanner(System.in);

        double usd = Double.parseDouble(usdCurrency.nextLine());
        double convertToBgn = usd * 1.7954;

        System.out.println(convertToBgn);

    }
}

