import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> p = new ArrayList<>();
        p.add(new Employee("John", "Lennon", "Employee", 27045.78));
        p.add(new Employee("George", "Harrison", "Employee", 50000));
        p.add(new Student("Ringo", "Starr", 1.9));
        p.add(new Student("Paul", "McCartney", 3.7));

        printData(p);
    }

    public static void printData(ArrayList<Person> people) {
        for (Person person : people) {
            System.out.println(person.getPosition() + ": " + person.getId() + ". " + person.getName() + " "
                    + person.getSurname() + " earns " + (person instanceof Student ? ((Student) person).getPaymentAmount() : ((Employee) person).getSalary()) + " tenge");
        }
    }
}
