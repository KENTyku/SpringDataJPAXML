package com.ardecs.SpringDataJpaXml;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
 *
 * @author jury
 */
//@Component
@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue
    @NotNull
    private long id;
    @NotNull
    @Column(name = "category_name")
    private String categoryName;

    public Category() {
    }

    Category(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the country_name
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param catgory_name the catgory_name to set
     */
    public void setCategoryName(String catgory_name) {
        this.categoryName = catgory_name;
    }
    @Override
    public String toString(){

        return id+" "+ categoryName;
    }

}
