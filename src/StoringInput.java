import java.util.Scanner;

public class StoringInput {
    public static void main (String [] args) {
        String firstIntitial,lastName;
        int houseNumber;
        String streetName, streetType, city;

        // scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("firstIntitial: ");
        firstIntitial = input.nextLine();
        System.out.println("lastName: ");
        lastName = input.nextLine();
        System.out.println("houseNumber: ");
        houseNumber = input.nextInt();
        input.nextLine();
        System.out.println("streetName: ");
        streetName = input.nextLine();
        System.out.println("streetType: ");
        streetType = input.nextLine();
        System.out.println("city: ");
        city = input.nextLine();

        System.out.println(firstIntitial + " " +lastName + " " + houseNumber);
        System.out.println(streetName +" " + streetType + " " + city);

    }
}
