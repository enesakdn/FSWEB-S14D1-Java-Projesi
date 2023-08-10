package Model.Developer;

public class HRManager extends Employee{
    private JuniorDeveloper[] junior;
    private MidDeveloper[] mid;
    private SeniorDeveloper[] senior;

    public HRManager(int id, String name, double salary, JuniorDeveloper[] junior, MidDeveloper[] mid, SeniorDeveloper[] senior) {
        super(id, name, salary);
        this.junior = junior;
        this.mid = mid;
        this.senior = senior;
    }

    public void addEmploye(int index, JuniorDeveloper developer) {
        try {
            if (junior[index] == null) {
                junior[index] = developer;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index not found " + ex.getMessage());
        }
    };
    public void addEmploye(int index, MidDeveloper developer) {
        try {
            if (mid[index] == null) {
               mid[index] = developer;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index not found " + ex.getMessage());
        }
    }
    public void addEmploye(int index, SeniorDeveloper developer) {
        try {
            if (senior[index] == null) {
                senior[index] = developer;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index not found " + ex.getMessage());
        }
    }
    public void words() {
        setSalary(60000);
        System.out.println("HRManager Starts To Working");
    }
    public String toString() {
      return "SeniorDeveloper işe başladı" + senior + getId()+getName() +
      "MiddleDeveloper işe başladı"+ mid + getId() + getName() +
              "Junior Developer işe başladı" + junior+ getName()+getId();

    }


}
