package Model.Developer;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
    public void Work() {
        setSalary(45000);
        System.out.println("Senior Developer starts to Working");
    }
    public String toString() {
        return "id: " + getId() + "name: " + getName();
    }
}
