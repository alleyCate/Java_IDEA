package Day16.b_set;

import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private double salary;

    public Person() {}

    public Person(int ID, String name, double salary) {
        this.id = ID;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        System.out.println("equals方法被调用");
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person p = (Person) obj;
        return this.id == p.id
                && this.name.equals(p.name)
                && this.salary == p.salary;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode被调用");
        return Objects.hash(id, name, salary);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
