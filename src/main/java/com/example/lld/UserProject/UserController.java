package com.example.lld.UserProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepo userRepo;
    @Autowired ProductRepo productRepo;

    @GetMapping("/test")
    public void test(){
//        User u1 = new User();
//        User u2 = new User();
//        Product p1 = new Product();
//        Product p2 = new Product();
//        productRepo.save(p1);
//        productRepo.save(p2);
//        u1.setProduct(Arrays.asList(p1));
//        u2.setProduct(Arrays.asList(p2));
//        userRepo.save(u1);
//        userRepo.save(u2);
    }

    @GetMapping("/query")
    public List<User> query(){
        return userRepo.findAll();
    }
}
