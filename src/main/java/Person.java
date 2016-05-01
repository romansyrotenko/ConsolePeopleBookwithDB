public class Person {

    private String name;
    private int age;
    private String email;

    public Person() {
        this.name = "";
        this.age = 0;
        this.email = "";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.email = "";
    }

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {

        String emailField= "";

        if (!((email == null) || (email.isEmpty()))) {
            emailField = ", email='" + email + "'";
        }
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                emailField +
                '}';
    }

}
