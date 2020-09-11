package com.bootmvc.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootmvc.model.User;
import com.bootmvc.repository.UserRepository;

@RestController
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
	private UserRepository repository;
    
    @PostMapping(path="/add")
    public User addNewUser(@RequestBody User user) {
    	
    	return repository.save(user);
   	
    }
    @GetMapping(path="/{id}")
    public Optional<User> getUser(@PathVariable(value="id") Integer id){
    	return repository.findById(id);
    }
    @GetMapping(path="/all")
    public Iterable<User> getAllUsers(){
    	return repository.findAll();
    }
}
