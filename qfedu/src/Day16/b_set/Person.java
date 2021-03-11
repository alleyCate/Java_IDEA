package Day16.b_set;

public class Person {
    private int ID;
    private String name;
    private double salary;

    public Person() {}

    public Person(int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person p = (Person) obj;
        return this.ID == p.ID
                && this.name.equals(p.name)
                && this.salary == p.salary;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode被调用");
        return ID;
    }
}
