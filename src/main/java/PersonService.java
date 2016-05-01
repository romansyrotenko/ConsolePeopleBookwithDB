public class PersonService implements Service {

    PersonDao personDao = new PersonDao();

    public void save(Person person) {

        if (Validator.isValidPerson(person)) {
            personDao.add(person);
        }
    }

    public Storage findByName(String name) {
        return personDao.findPersonByName(name);
    }

    public Storage findByEmail(String email) {
        return personDao.findPersonByEmail(email);
    }

    public void printStorage() {
        Storage.print(personDao.getAll());
    }

    public void addPerson(ReadInput readInput) {

        String name = readInput.readString("name");
        int age = readInput.readNumber("age");
        String email = readInput.readString("email");
        Person person = new Person(name, age, email);
        save(person);
    }


}
