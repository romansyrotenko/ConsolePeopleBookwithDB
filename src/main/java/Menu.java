public class Menu {

    private ReadInput readInput;
    public static int MENUEXITITEM = 0;
    public static int MENUMAXITEM = 3;

    public Menu(ReadInput readInput) {
        this.readInput = readInput;
    }

    public int mainMenu() {

        System.out.println("\n-----\nWelcome to Persons Storage app! What do you want to do?");
        System.out.println("-----" +
                "\n1  - Add New Person" +
                "\n2  - Search By Name" +
                "\n3  - Search By Email" +
                "\n--" +
                "\n99 - Print Storage" +
                "\n--" +
                "\n0  - Exit");

        return readMenuItem();
    }

    public int readMenuItem() {

        int menuItem = readInput.readNumber("menu item");
        while (!Validator.isValidMenuItem(menuItem)) {
            menuItem = readInput.readNumber("menu item");
        }
        return menuItem;
    }
}
