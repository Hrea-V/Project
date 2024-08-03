package com.example.demo.model;

//

import java.math.BigDecimal;

public class MenuItem {
    private Integer id;
    private String name;
    private BigDecimal price;
    private Integer year;
    //Using Validation Constraints enforce the following rules:
    //
    //    No elements should be null
    //    The maximum allowable price should be 18.50
    //    The year can have at most 4 digits
    //
    //Remember that primitive values can never have a null value. To enforce the rule that elements should not be null on a primitive, you must use the appropriate wrapper class. Also. This class is NOT a model, do not add any other annotation related to models.

    public MenuItem(Integer id, String name, BigDecimal price, Integer year) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

}
