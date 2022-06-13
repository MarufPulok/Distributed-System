import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Chain error = new ErrorLogger();
        Chain warning = new WarningLogger();
        Chain console = new ConsoleLogger();

        error.setNextChain(warning);
        warning.setNextChain(console);

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Message message = new Message(command);
        error.write(message);
    }
}
