/* This is a OneToMany relationship. DO NOT use join table.

Create SpringBoot application for People and Pets.
Each Pet can have only one owner and each person can own multiple pets.

This makes the relationship between people and pets one to many.
So look at the example for one to many in the SpringBoot guides and follow that.
*******The Person class should contain a set or ArrayList of Pets.
The Pet class should contain a Person (remember Composition?).

As you work think how you can simply the process (create a checklist?) for creating a new application.
This will make it easier on your Friday project. */
package com.example.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    /*One owner per pet (one director per movie)*/
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, fetch = FetchType.EAGER)      // each person goes TO ZERO~MANY pets
    public Set<Pet> pets;

    public Person(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
