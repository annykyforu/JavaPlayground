package Department;

import Employee.Employee;

public class Department {
    private Employee[] employees;

    public Department(){
        this.employees = new Employee[10];  //Department can have max 10 employees
    }

    public void addEmployee(Employee newEmployee){
        //TODO
    }

    public Employee[] getDepartment(){
        return this.employees;
    }

    public int nrOfEmployees(){
        int counter = 0;
        for(Employee e : this.employees){
            if (e != null) counter++;
        }
        return counter;
    }

    public void identifyEmployee(int id){
        for(Employee employee : this.employees){
            if(employee.getId() == id){
                System.out.println(employee);
            }
        }
        System.out.println("Employee with ID: " + id + " is not found.");
    }
}
