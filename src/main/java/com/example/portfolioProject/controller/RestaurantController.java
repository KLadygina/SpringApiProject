package com.example.portfolioProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.portfolioProject.repository.DishRepository;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RequestMethod;



@RestController
public class RestaurantController {

    @Autowired
    private final DishRepository dishRepository;

    public RestaurantController(DishRepository dishRepository){
        this.dishRepository = dishRepository;
    }

    @GetMapping("/restaurant")
    public String helloWorld() {
        String message = "Hello World!";
        return message;
    }
    
    // @GetMapping()

}
