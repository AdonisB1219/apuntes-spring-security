package com.abm.auth.controller;

import com.abm.auth.model.Customer;
import com.abm.auth.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/login")
    public String login(){
        return "Login completado";
    }

    @PostMapping("/register")
    public String register(@RequestBody Customer customer){
        System.out.println("REGISTER METHOD");
        System.out.println(customer);
        try{
            String hashPwd = passwordEncoder.encode(customer.getPassword());
            customer.setPassword(hashPwd);
            customerRepository.save(customer);
        } catch(Exception e){
            System.out.println(e);
        }
        return "Cliente registrado exitosamente.";
    }
}
