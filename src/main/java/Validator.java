import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean isValidAge(int value) {
        return (value > 0 && value < 101);
    }

    public static boolean isValidName(String name) {
        return (name.length() >= 4);
    }

    public static boolean isValidEmail(String email) {

        if (email.isEmpty()) {
            return true;
        } else {
            Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
            return matcher.find();
        }
    }

    public static boolean isValidPerson(Person person) {

        if (isValidName(person.getName()) & isValidAge(person.getAge()) & isValidEmail(person.getEmail())) {
            return true;
        } else {
            String errorMessage = "Something wrong... ";

            if (!isValidName(person.getName())) {
                errorMessage = errorMessage + "Name isn't valid! ";
            }
            if (!isValidAge(person.getAge())) {
                errorMessage = errorMessage + "Age isn't valid! ";
            }
            if (!isValidEmail(person.getEmail())) {
                errorMessage = errorMessage + "Email isn't valid! ";
            }
            System.out.println(errorMessage + " Can't add this Person!");
            return false;
        }
    }

    public static boolean isValidMenuItem(int value) {

        if (value > -1 && value <= Menu.MENUMAXITEM | value == 99) {
            return true;
        } else {
            System.out.println("Please, enter valid menu item\n-----");
            return false;
        }
    }

}