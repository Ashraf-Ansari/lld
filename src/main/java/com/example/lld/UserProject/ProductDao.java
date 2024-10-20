package com.example.lld.UserProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDao {
    @Autowired
    private ProductRepo productRepo;
}
