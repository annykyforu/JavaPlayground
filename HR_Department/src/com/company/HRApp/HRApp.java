package com.company.HRApp;

import Employee.Employee;

public class HRApp {

    public static void main(String[] args) {
        System.out.println("Hello! HRApp is started.");

        Employee empl1 = new Employee(404, "John", 3400);
        System.out.println(empl1);
    }
}
