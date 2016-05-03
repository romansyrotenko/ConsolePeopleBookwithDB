import java.util.ArrayList;
import java.util.List;

public class Storage {

    List<Person> list = new ArrayList<>();

    public void add(Person person) {
        list.add(person);
    }

    @Override
    public String toString() {

        return "Storage{" +
                "list=" + list +
                '}';
    }

    public List<Person> getList() {
        return list;
    }

    public static void printSearchResults(Storage storage) {

        System.out.println("There are " + storage.getList().size() + " found people...");
        print(storage);
    }

    public static void print(Storage storage) {

        List<Person> array = storage.getList();

        if (!array.isEmpty()) {
            for (Person person : array) {
                if (person != null) {
                    System.out.println(person);
                }
            }
        } else {
            System.out.println("Nothing print...");
        }
    }
}