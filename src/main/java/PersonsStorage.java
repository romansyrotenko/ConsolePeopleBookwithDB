public class PersonsStorage {

    public static void main(String args[]) {

        Service personService = new PersonService();
        ReadInput readInput = new ReadInput();
        Menu menu = new Menu(readInput);
        int menuItem = -1;

        while (menuItem != Menu.MENUEXITITEM) {
            menuItem = menu.mainMenu();
            if (menuItem == 1) {
                System.out.println("Add person:");
                personService.addPerson(readInput);

            } else if (menuItem == 2) {
                System.out.println("Search person by name:");
                String searchName = readInput.readString("name");
                Storage.printSearchResults(personService.findByName(searchName));

            } else if (menuItem == 3) {
                System.out.println("Search person by email:");
                String searchEmail = readInput.readString("email");
                Storage.printSearchResults(personService.findByEmail(searchEmail));

            } else if (menuItem == 99) {
                System.out.println("Current Storage:");
                personService.printStorage();
            }
        }
        System.out.println("Exiting ...");
    }
}