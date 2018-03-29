package com.raso.prototype_pattern;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private ArrayList<String> employeesList;

    public Employees() {
        employeesList = new ArrayList<>();
    }

    public Employees(ArrayList<String> emlist) {
        employeesList = emlist;
    }

    public void loadData(){

        employeesList.add("Employee1");
        employeesList.add("Employee2");
        employeesList.add("Employee3");
        employeesList.add("Employee4");

    }

    public ArrayList<String> getEmployeesList() {
        return employeesList;
    }

    public Object clone() {

        ArrayList<String> temp = new ArrayList<>();
        for (String s : employeesList
                ) {
            temp.add(s);
        }
        return new Employees(temp);

    }

}
