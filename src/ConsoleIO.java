import java.util.Scanner;

public class ConsoleIO {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static void print(String message) {
        System.out.println(message);
    }
}