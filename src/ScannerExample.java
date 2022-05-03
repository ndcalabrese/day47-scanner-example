import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Print "Provide text for the Scanner to read: "
        System.out.println("Provide text for the Scanner to read: ");

        // The string provided by the user will be assigned to the text variable
        // Scanner will read the input entered by the user
        String text = scanner.nextLine();

        // Print the user's text that was entered
        System.out.println(text);
    }
}