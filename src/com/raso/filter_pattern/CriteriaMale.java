package com.raso.filter_pattern;

import java.util.ArrayList;


public class CriteriaMale implements Criteria{

    @Override
    public ArrayList<Person> meetCriteria(ArrayList<Person> personList) {

        ArrayList<Person> malePersons = new ArrayList<>();
        for (Person p: personList
                ) {
            if(p.getGender()==Person.GENDER.MALE){
                malePersons.add(p);
            }
        }

        return malePersons;
    }
}
