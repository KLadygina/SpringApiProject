package com.example.portfolioProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="RESTAURANT")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="NAME_DISH")
    private String nameDish;

    @Column(name="COUSINE_TYPE")
    private String cousineType;

    public Dish() {
    }

    public Dish(String nameDish, String cousineType) {
        this.nameDish = nameDish;
        this.cousineType = cousineType;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNameDish() {
        return nameDish;
    }
    public void setNameDish(String nameDish) {
        this.nameDish = nameDish;
    }

    public String getCousineType() {
        return cousineType;
    }
    public void setCousineType(String cousineType) {
        this.cousineType = cousineType;
    }

    
    

    
}
