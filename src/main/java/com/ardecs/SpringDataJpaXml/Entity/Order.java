package com.ardecs.SpringDataJpaXml.Entity;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
 * @author jury
 */
//@Component
@Entity
@Table(name = "OrderTable")
public class Order {

    @Id
    @GeneratedValue
    @NotNull
    private long id;
    @NotNull
    private String date;
    @OneToMany
    private List<OrderPosition> orderPositions;

    public Order() {
    }

    Order(String date) {
        this.date = date;
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
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {

        return id + " " + date;
    }


    public List<OrderPosition> getOrderPositions() {
        return orderPositions;
    }

    public void setOrderPositions(List<OrderPosition> orderPositions) {
        this.orderPositions = orderPositions;
    }
}