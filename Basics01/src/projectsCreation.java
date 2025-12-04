import java.util.Scanner;

public class projectsCreation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameOfArchitect = scanner.nextLine();
        int countOfProjects = Integer.parseInt(scanner.nextLine());

        int neededHours = countOfProjects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", nameOfArchitect, neededHours, countOfProjects);
    }
}
