package com.raso.filter_pattern;

public class Person {
    private String name;
    private int age;
    private GENDER gender;
    private MARTIAL_STATUS martialStatus;

    Person(String name, int age, GENDER gender, MARTIAL_STATUS martialStatus){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.martialStatus = martialStatus;
    }

    public MARTIAL_STATUS getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(MARTIAL_STATUS martialStatus) {
        this.martialStatus = martialStatus;
    }

    public static enum GENDER {
        FEMALE, MALE
    }

    public static enum MARTIAL_STATUS {
        SINGLE, MARRIED
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

}
