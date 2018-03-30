package com.raso.filter_pattern;

import java.util.ArrayList;

public class CriteriaMarried implements Criteria{

    @Override
    public ArrayList<Person> meetCriteria(ArrayList<Person> personList) {

        ArrayList<Person> marriedPersons = new ArrayList<>();
        for (Person p: personList
                ) {
            if(p.getMartialStatus()==Person.MARTIAL_STATUS.MARRIED){
                marriedPersons.add(p);
            }
        }
        return marriedPersons;

    }
}
