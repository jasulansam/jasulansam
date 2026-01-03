public class Student extends Person {
    private double gpa;

    public Student() {
        super();
        this.gpa = 0.0;
    } // dafault
    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    } // parametrized

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
    @Override
    public String getPosition() {
        return "Student";
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return  36660.0;
        }
        return 0.0;
    }

}
