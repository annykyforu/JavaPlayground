package com.company.HRApp;

import Department.Department;
import Employee.Employee;

import java.text.DecimalFormat;

public class HRApp {
    public static DecimalFormat format = new DecimalFormat("##.00");

    public static void main(String[] args) {
        System.out.println("Hello! HRApp is started.");

        Department dep1 = new Department("UniWien");
        dep1.addEmployee(new Employee(404, "John", 3400));
        dep1.addEmployee(new Employee(777, "Alice", 7200));
        dep1.addEmployee(new Employee(123, "Alice", 7200));

        System.out.println(dep1.getName() + " department");
        for(Employee empl : dep1.getDepartment()){
            System.out.println(empl);
        }
        System.out.println("Total employees: " + dep1.nrOfEmployees());
        System.out.println(dep1.getEmployeeByID(77));

        System.out.println("Total Salary: " + format.format(dep1.getTotalSalary()));
        System.out.println("Average Salary: " + format.format(dep1.getAverageSalary()));

    }
}
