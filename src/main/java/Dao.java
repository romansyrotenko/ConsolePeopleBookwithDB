public interface Dao {

    void add(Person person);

    Storage getAll();

    Storage findPersonByName(String name);

    Storage findPersonByEmail(String name);

}
