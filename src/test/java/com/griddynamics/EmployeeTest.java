package com.griddynamics;

import org.testng.annotations.Test;

public class EmployeeTest {

    @Test
    public void checkEmployee() {
        Employee emptyEmployee = Employee.builder().build();
        Employee filledEmployee = new Employee().toBuilder().build();

        System.out.println(filledEmployee);
        System.out.println(emptyEmployee);
    }

    @Test
    public void checkNullProject() {
        Employee filledEmployee = new Employee().toBuilder().clearProjects().build();
        System.out.println(filledEmployee);

        Employee emptyEmployee = new Employee();
        System.out.println(emptyEmployee);
    }
}
