package com.raso.prototype_pattern;

import java.util.ArrayList;

public class PrototypePatternTest {

    public static void main(String[] args){

        Employees employees =  new Employees();
        employees.loadData();
        /*
        * Notice here there are only 4 employees in the employeeList
         */

        Employees empNew = (Employees) employees.clone();
        ArrayList<String> empNewList = empNew.getEmployeesList();
        empNewList.add("Employee5");

        /*
        you should notice that empNew will contain the employees in employees object plus one newly added.
        Total should be 5 employees.
         */

        Employees empNew1 = (Employees) employees.clone();
        ArrayList<String> empNewList1 = empNew1.getEmployeesList();
        empNewList1.remove("Employee4");
        /*
        You should also notice that the new employees object called empNew1 should contain the employees in employees object
        minus one. Total should be 3 employees
         */

        for (String s:empNewList
             ) {
            System.out.print(s+ " ");
        }
        System.out.println();


        for (String s:empNewList1
                ) {
            System.out.print(s+ " ");
        }
        System.out.println();

    }
}
