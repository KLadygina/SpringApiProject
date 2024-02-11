package com.example.portfolioProject.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.portfolioProject.model.Dish;

// import java.util.List;


public interface DishRepository extends CrudRepository<Dish, Long>{
    // public Dish findByName(String dishName);
}
