import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the number of Account: ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter agency number with digit (xxx-x): ");
        String agency = (scanner.nextLine());

        System.out.println("Enter the Client's full name: ");
        String clientName = (scanner.nextLine());

        System.out.println("Enter account balance: ");
        float accountBalance = (scanner.nextFloat());


        System.out.println("Hello " + clientName + ", thank you for creating an account with our bank, your branch is " + agency + ", number, " + number + " and your balance " + accountBalance + " is now available for withdrawal.");
    }
}