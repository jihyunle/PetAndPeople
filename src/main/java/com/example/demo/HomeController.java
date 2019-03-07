/* This is a OneToMany relationship. DO NOT use join table.

Create SpringBoot application for People and Pets.
Each Pet can have only one owner and each person can own multiple pets.

This makes the relationship between people and pets one to many.
So look at the example for one to many in the SpringBoot guides and follow that.
The Person class should contain a set or ArrayList of Pets.
The Pet class should contain a Person (remember Composition?).

As you work think how you can simply the process (create a checklist?) for creating a new application.
This will make it easier on your Friday project. */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/")
    public String index(Model model){
        Person owner = new Person();
        owner.setName("Doyle");

        Pet pet = new Pet();
    }


}
