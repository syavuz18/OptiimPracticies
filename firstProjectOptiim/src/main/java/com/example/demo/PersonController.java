package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;
    private String id;

    @PostMapping("/addPerson")
    public String savePerson(@RequestBody Person person){
        personRepository.save(person);
        return "Person added successfully:" + person.getId();
    }

    @GetMapping("/getPersons")
    public List<Person> getPersons(){
        return personRepository.findAll();
    }

    @GetMapping("/getPerson/{id}")
    public Optional<Person> getPerson(@PathVariable String id){
        return personRepository.findById(id);
    }

    @GetMapping("/deletePerson/{id}")
    public String deletePerson(@PathVariable String id){
        personRepository.deleteById(id);
        return "Deleted person successfully: " + id;
    }

    @PutMapping("/updatePerson/{id}")
    public void updatePerson(@PathVariable String id, @RequestBody Person person){
        Optional<Person> toBeUpdatedPerson = personRepository.findById(id);

            Person _person = toBeUpdatedPerson.get();
            _person.setFirstName(person.getFirstName());
            _person.setLastName(person.getLastName());
            _person.setFavoriteDessert(person.getFavoriteDessert());
            _person.setYearOfBirth(person.getYearOfBirth());
            personRepository.save(_person);

    }



}
