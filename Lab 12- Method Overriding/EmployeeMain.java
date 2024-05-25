
package com.anudip.method_overriding; 

class Employee {
    private String name;
    private String role;

    // Constructors
    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Employee() {
        // Default constructor
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee(); // Create a new Employee object

        // Set employee details
        emp.setName("Vijaya");
        emp.setRole("Manager");

        // Display employee details
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Role: " + emp.getRole());
    }
}
