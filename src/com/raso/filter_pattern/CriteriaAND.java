package com.raso.filter_pattern;

import java.util.ArrayList;

public class CriteriaAND implements Criteria{

    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public CriteriaAND(Criteria firstCriteria, Criteria secondCriteria){
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }


    @Override
    public ArrayList<Person> meetCriteria(ArrayList<Person> personList) {

        ArrayList<Person> firstMeetedCriteria = firstCriteria.meetCriteria(personList);
        ArrayList<Person> secondMeetedCriteria = secondCriteria.meetCriteria(firstMeetedCriteria);
        return secondMeetedCriteria;

    }
}
