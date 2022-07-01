package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private int favoriteNumber;
    private String hairColor;
    private int year;
    private int height;

    //constructor. Setters and getters. Need to have a space holder for variables that are
    //personal to a class as this will continue to change as this lab requires to ability to change the person.
    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.gender = "";
        this.favoriteNumber = Integer.MAX_VALUE;
        this.hairColor = "";
        this.year = Integer.MAX_VALUE;
        this.height = Integer.MAX_VALUE;

    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {this.gender = gender;}

    public void setYear(int year) {this.year = year;}

    public void setFavoriteNumber(int favoriteNumber) {this.favoriteNumber = favoriteNumber;}

    public void setHairColor(String hairColor) {this.hairColor = hairColor;}
    public void setHeight(int height) {this.height = height;}





    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getGender() {return this.gender;}

    public Integer getYear() {return this.year;}

    public Integer getFavoriteNumber() {return this.favoriteNumber;}

    public String getHairColor() {return this.hairColor;}

    public Integer getHeight() {return this.height;}



}
