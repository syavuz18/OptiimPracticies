package com.example.demo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Document(collection = "Person")
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String  id;

    private String firstName;
    private String lastName;
    private String favoriteDessert;
    private long yearOfBirth;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getFavoriteDessert() {
        return favoriteDessert;
    }

    public void setFavoriteDessert(String favoriteDessert) {
        this.favoriteDessert = favoriteDessert;
    }

    public long getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(long yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


}
