
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter first initial: ");
        String firstInitial = reader.nextLine();

        System.out.println("Enter last name: ");
        String lastName = reader.nextLine();

        System.out.println("Enter house number: ");
        int houseNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Enter street name: ");
        String streetName = reader.nextLine();

        System.out.println("Enter street type: ");
        String streetType = reader.nextLine();

        System.out.println("Enter city: ");
        String city = reader.nextLine();

        // Printint out using System.out.println()
        System.out.print(firstInitial + " "+ lastName + " "+ houseNumber + " ");
        System.out.println(streetName + " "+ streetType + " "+ city);
    }
}
