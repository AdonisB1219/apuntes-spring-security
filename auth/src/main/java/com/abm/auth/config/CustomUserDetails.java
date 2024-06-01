package com.abm.auth.config;


import com.abm.auth.model.Customer;
import com.abm.auth.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetails implements UserDetailsService {

    @Autowired
    CustomerRepository customerRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        String fetchedEmail, password;
        List<GrantedAuthority> authorities;
        List<Customer> customer = customerRepository.findByEmail(email);
        if(customer.isEmpty()){
            throw new UsernameNotFoundException("User details not found for the user : " + email);
        } else{
            fetchedEmail = customer.get(0).getEmail();
            password = customer.get(0).getPassword();
            authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority(customer.get(0).getRole()));
        }
        return new User(fetchedEmail,password,authorities);
    }
}
