package com.raso.filter_pattern;

import java.util.ArrayList;

public class CriteriaSingle implements Criteria{

    @Override
    public ArrayList<Person> meetCriteria(ArrayList<Person> personList) {

        ArrayList<Person> singlePersons = new ArrayList<>();
        for (Person p: personList
             ) {
            if(p.getMartialStatus()==Person.MARTIAL_STATUS.SINGLE){
                singlePersons.add(p);
            }
        }
        return singlePersons;

    }

}
