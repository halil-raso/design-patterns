package com.raso.filter_pattern;


import java.util.ArrayList;

public class CriteriaOR implements Criteria{

    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public CriteriaOR(Criteria firstCriteria, Criteria secondCriteria){
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }



    @Override
    public ArrayList<Person> meetCriteria(ArrayList<Person> personList) {

        ArrayList<Person> firstMeetedCriteria = firstCriteria.meetCriteria(personList);

        ArrayList<Person> secondMeetedCriteria = secondCriteria.meetCriteria(personList);

        ArrayList<Person> finalPersonList = new ArrayList<>();

        for(Person p: firstMeetedCriteria){
            finalPersonList.add(p);
        }

        for ( Person p: secondMeetedCriteria
             ) {
            if(!finalPersonList.contains(p)){
                finalPersonList.add(p);
            }
        }

        return finalPersonList;
    }

}
