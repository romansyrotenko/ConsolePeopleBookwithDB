public interface Service {

    void save(Person person);

    void addPerson(ReadInput readInput);

    Storage findByName(String name);

    Storage findByEmail(String email);

    void printStorage();

}