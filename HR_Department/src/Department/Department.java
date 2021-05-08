package Department;

import Employee.Employee;

public class Department {
    private String name;
    private Employee[] employees;

    public Department(String _name){
        setName(_name);
        this.employees = new Employee[10];  //Department can have max 10 employees
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void addEmployee(Employee newEmployee){
        for(int idx = 0; idx < employees.length; idx++){
            if(employees[idx] == null){
                employees[idx] = newEmployee;
                System.out.println("Employee: " + newEmployee.getName() + " is added to the department.");
                return;
            }
        }
        System.out.println("Couldn't add the new Employee to the Department. Department is full.");
    }

    public Employee[] getDepartment(){
        Employee[] actualDepartment = new Employee[nrOfEmployees()];
        int idx = 0;
        for(Employee empl : this.employees){
            if(empl != null){
                actualDepartment[idx] = empl;
                ++idx;
            }
        }
        return actualDepartment;
    }

    public int nrOfEmployees(){
        int counter = 0;
        for(Employee e : this.employees){
            if (e != null) counter++;
        }
        return counter; }

    public Employee getEmployeeByID(int id){
        for(Employee employee : getDepartment()){
            if(employee.getId() == (id)){
                return employee;
            }
        }
        System.out.print("Employee with ID: " + id + " is not found. ");
        return null;
    }

    public double getTotalSalary(){
        double totalSalary = 0;
        for(Employee empl : getDepartment()){
            totalSalary += empl.getSalary();
        }
        return totalSalary;
    }

    public double getAverageSalary(){
        return getTotalSalary()/nrOfEmployees();
    }

}
