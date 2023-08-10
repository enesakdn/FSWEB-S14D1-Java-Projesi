package Model.Developer;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
    public void Work() {
        setSalary(25000);
        System.out.println("Junior Developer starts to Working");
    }
    public String toString() {
        return "id: " + getId() + "name: " + getName();
    }
}
