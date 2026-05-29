import java.util.ArrayList;
import java.util.List;

public class HOSPITAL {
    private List<Person> people;

    public HOSPITAL() {
        people = new ArrayList<>();
    }
    public void addPerson(Person person) {
        people.add(person);
    }
    public void addPerson(Person person, boolean showWelcome) {
        people.add(person);
        if (showWelcome) {
            System.out.println("Welcome, " + person.getFirstName() + " " + person.getLastName());
        }
    }
    public void addPerson(Person person, String customMessage) {
        people.add(person);
        System.out.println(customMessage + " " + person.getFirstName());
    }
    public void displayAll() {
        for (Person p : people) {
            p.displayInfo();
            System.out.println("------");
        }
    }
}