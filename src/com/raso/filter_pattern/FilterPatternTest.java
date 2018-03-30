package com.raso.filter_pattern;

import java.util.ArrayList;
import java.util.List;

public class FilterPatternTest {

    public static void main(String[] args){

        ArrayList<Person> personList = new ArrayList<>();
        Person p1 =  new Person("Person1",23, Person.GENDER.MALE, Person.MARTIAL_STATUS.SINGLE);
        Person p2 =  new Person("Person2",33, Person.GENDER.MALE,Person.MARTIAL_STATUS.MARRIED);
        Person p3 =  new Person("Person3",25, Person.GENDER.FEMALE,Person.MARTIAL_STATUS.MARRIED);
        Person p4 =  new Person("Person4",23, Person.GENDER.FEMALE, Person.MARTIAL_STATUS.MARRIED);

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);


        CriteriaMale maleCriteria = new CriteriaMale();
        CriteriaFemale femaleCriteria = new CriteriaFemale();
        CriteriaSingle singleCriteria = new CriteriaSingle();
        CriteriaMarried marriedCriteria = new CriteriaMarried();
        CriteriaAND criteriaAND = new CriteriaAND(marriedCriteria, maleCriteria);
        CriteriaOR criteriaOR = new CriteriaOR(marriedCriteria, singleCriteria);


        ArrayList<Person> malePersonList = maleCriteria.meetCriteria(personList);
        ArrayList<Person> femalePersonList = femaleCriteria.meetCriteria(personList);
        ArrayList<Person> singlePersonList = singleCriteria.meetCriteria(personList);
        ArrayList<Person> marriedPersonList = marriedCriteria.meetCriteria(personList);

        ArrayList<Person> marriedMalePersonList = criteriaAND.meetCriteria(personList);
        ArrayList<Person> marriedOrSinglePersonList = criteriaOR.meetCriteria(personList);


        System.out.println("Male Persons");
        printPersons(malePersonList);

        System.out.println("Female Persons");
        printPersons(femalePersonList);

        System.out.println("single Persons");
        printPersons(singlePersonList);

        System.out.println("Married Persons");
        printPersons(marriedPersonList);

        System.out.println("Married and Male Persons");
        printPersons(marriedMalePersonList);

        System.out.println("Married or single Persons");
        printPersons(marriedOrSinglePersonList);



    }


    public static void printPersons(ArrayList<Person> personList){

        System.out.println("******************************");
        for (Person p: personList
                ) {
            System.out.println("Name: "+ p.getName()+" Gender: "+ p.getGender()+ " Age: "+ p.getAge()+" Martial Status: "+p.getMartialStatus());
        }
        System.out.println("******************************");

    }
}
