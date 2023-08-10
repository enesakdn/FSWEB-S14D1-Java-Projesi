package Model.Developer;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
    public void Work() {
        setSalary(35000);
        System.out.println("Middle Developer starts to Working");
    }
    public String toString() {
        return "id: " + getId() + "name: " + getName();
    }
}
