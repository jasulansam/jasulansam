public class Person implements Payable, Comparable<Person> {
    private static int idCount = 1;
    private int id;
    private String name;
    private String surname;

    public Person() {
        this.id = idCount++;
        this.name = "";
        this.surname = "";
    } // default
    public Person(String name, String surname) {
        this.id = idCount++;
        this.name = name;
        this.surname = surname;
    } // Parametrized
    @Override
    public String toString() {
        return id + "." + name + " " + surname;
    }
    public String getPosition() {
        return "Student";
    }
    public int getId() {
        return id;
    }
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
