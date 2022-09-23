/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.springbootproject.SpringBoot_Project.dao;
//data access object

import com.springbootproject.SpringBoot_Project.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author appletan
 */
public interface AlienRepo extends JpaRepository<Alien,Integer>{
    
}
