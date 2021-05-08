package Employee;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int _id, String _name, double _salary){
        this.setId(_id);
        this.setName(_name);
        this.setSalary(_salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    @Override
    public String toString(){
        return "Employee: " + getId() + " " + getName() + " | Salary: " + getSalary();
    }
}
