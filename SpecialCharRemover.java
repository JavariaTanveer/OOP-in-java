import java.util.Scanner;

public class SpecialCharRemover {
    private String message;

    public SpecialCharRemover(String message) {
        this.message = message;
    }

    public void removeSpecialChars() {
        message = message.replaceAll("[^a-zA-Z0-9\\s]+", "");
    }

    public void displayMessage() {
        System.out.println("Message without special characters: " + message);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = sc.nextLine();
        SpecialCharRemover remover = new SpecialCharRemover(message);
        remover.removeSpecialChars();
        remover.displayMessage();
    }
}
