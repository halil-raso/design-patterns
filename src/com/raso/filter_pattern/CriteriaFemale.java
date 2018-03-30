package com.raso.filter_pattern;

import java.util.ArrayList;

public class CriteriaFemale implements Criteria{

    @Override
    public ArrayList<Person> meetCriteria(ArrayList<Person> personList) {

        ArrayList<Person> femalePersons = new ArrayList<>();
        for (Person p: personList
             ) {
            if(p.getGender() == Person.GENDER.FEMALE){
                femalePersons.add(p);
            }
        }
        return femalePersons;
    }
}
