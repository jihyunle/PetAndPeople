/* This is a OneToMany relationship. DO NOT use join table.

Create SpringBoot application for People and Pets.
Each Pet can have only one owner and each person can own multiple pets.

This makes the relationship between people and pets one to many.
So look at the example for one to many in the SpringBoot guides and follow that.
The Person class should contain a set or ArrayList of Pets.
*******The Pet class should contain a Person (remember Composition?).

As you work think how you can simply the process (create a checklist?) for creating a new application.
This will make it easier on your Friday project. */
package com.example.demo;

import javax.persistence.*;

@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String type;

    private String age;

    @ManyToOne(fetch = FetchType.EAGER)     // this of it like this. Each pet goes TO ONE owner.
    @JoinColumn(name = "person_id")
    private Person owner;

    public Pet(){

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
