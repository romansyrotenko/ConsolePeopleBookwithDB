public interface Service {

    void save(Person person);

    void addPerson(ReadInput readInput);

    Storage findByName(String name);

    Storage findByEmail(String email);

    void printStorage();
//интерфейс может исплоьзоваться только в области пакета??
}