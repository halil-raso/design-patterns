package com.raso.composite_pattern;

import java.util.ArrayList;

public class CompositePatternTest {

    public static void main(String[] args){

        Employee CEO = new Employee("CEO",40000);

        Employee developer1 = new Employee("DEVELOPER 1",5000);
        Employee developer2 = new Employee("DEVELOPER 2",5000);
        Employee developer3 = new Employee("DEVELOPER 3",5000);


        Employee manager1 = new Employee("MANAGER 1",5000);
        Employee manager2 = new Employee("MANAGER 2",5000);
        Employee manager3 = new Employee("MANAGER 3",5000);


        CEO.add(manager1);
        CEO.add(manager2);
        CEO.add(manager3);

        manager1.add(developer1);
        manager1.add(developer2);

        manager2.add(developer3);

        System.out.println("CEO");
        showHerarchy(CEO);
        System.out.println("*********************");

        System.out.println("MANAGER 1");
        showHerarchy(manager1);
        System.out.println("*********************");

        System.out.println("MANAGER 2");
        showHerarchy(manager2);
        System.out.println("*********************");

        System.out.println("MANAGER 3");
        showHerarchy(manager3);
        System.out.println("*********************");

        System.out.println("DEVELOPER 1");
        showHerarchy(developer1);
        System.out.println("*********************");

        System.out.println("DEVELOPER 2");
        showHerarchy(developer2);
        System.out.println("*********************");

        System.out.println("DEVELOPER 3");
        showHerarchy(developer3);
        System.out.println("*********************");

    }

    public static void showHerarchy(Employee topEmployee){

        ArrayList<Employee> sub = topEmployee.getSubordinateList();

        System.out.println("Employee: "+topEmployee.getName()+" gets "+topEmployee.getSalary()+" $");

        if(sub.size()!=0){
            System.out.println("Employees under "+topEmployee.getName());
            for(Employee e:sub){
                System.out.println("NAME "+e.getName() + " gets "+e.getSalary()+ " $");
            }
        }


    }
}
