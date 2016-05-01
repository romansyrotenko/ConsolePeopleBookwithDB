import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadInput {

    private Scanner scanner;

    public ReadInput() {
        this.scanner = new Scanner(System.in);
    }

    public int readNumber(String item) {

        int number = -1;

        System.out.println("Enter " + item + ":");

        while(number < 0) {
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please, enter valid " + item);
            }
            finally {
                scanner.nextLine();
            }
        }
        return number;
    }

    public String readString(String item) {

        System.out.println("Enter " + item + ":");
        String name = scanner.nextLine();
        return name;
    }

}