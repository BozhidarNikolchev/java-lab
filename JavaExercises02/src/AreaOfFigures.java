import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfFigure = scanner.nextLine();
        
        double area = 0;

        if (typeOfFigure.equals("square")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            
            area = sideA * sideA;
            
        } else if (typeOfFigure.equals("rectangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            
            area = sideA * sideB;
            
        } else if (typeOfFigure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            
            area = (radius * radius) * Math.PI;
            
        } else if (typeOfFigure.equals("triangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());

            area = (h * sideA) / 2;
            
        }

        System.out.printf("%.3f", area);
    }
}
