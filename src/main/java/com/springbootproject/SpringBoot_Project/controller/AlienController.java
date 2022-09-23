/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springbootproject.SpringBoot_Project.controller;

import com.springbootproject.SpringBoot_Project.dao.AlienRepo;
import com.springbootproject.SpringBoot_Project.model.Alien;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author appletan
 */
@RestController
public class AlienController {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home() {
        return "Tutorial with Spring Boot";
    }

    @PostMapping("/alien")
    public Alien addAlien(@RequestBody Alien alien) {
        repo.save(alien);
        return alien;
    }
    
    @GetMapping(path="/aliens", produces={"application/json"})
    public List<Alien> getAliens(){
        return repo.findAll();
    }
    
    @GetMapping(path="/alien/{aid}",produces={"application/json"})
    public Optional<Alien> getAlien(@PathVariable("aid") int aid){
        return repo.findById(aid);
    }
    
    @DeleteMapping("/alien/{aid}")
    public String deleteAlien(@PathVariable int aid){
        Alien a = repo.getOne(aid);
        repo.delete(a);
        
        return "deleted";
    }
    
    @PutMapping(path="/alien", consumes={"application/json"})
    public Alien updateAlien(@RequestBody Alien alien) {
        repo.save(alien);
        return alien;
    }
}
