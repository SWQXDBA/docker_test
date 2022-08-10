package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@RestController
public class Controller1 {
    @Autowired
    PersonRep personRep;
    @Value("${myenv.env1}")
    String env;
    @RequestMapping("ok")
    public String ok(){
        return env;
    }
    @GetMapping("add")
    public String add(String name){
        Person person = new Person();
        person.name = name;
        add(person);
        return "added";
    }
    @GetMapping("get")
    public List<Person>  get(){
        final Iterable<Person> all = personRep.findAll();
        return new LinkedList<>((Collection<? extends Person>) all);
    }
    @Transactional
    void add(Person person){
        personRep.save(person);
    }
}
