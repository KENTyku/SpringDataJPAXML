package com.ardecs.SpringDataJpaXml;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * @author jury
 */
//@Component
@Entity
@Table(name = "order_position")
public class OrderPosition {
    @EmbeddedId
    private OrderPositionId id;
    private long quantity;

    public OrderPosition() {
    }

    OrderPosition(long quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the id
     */
    public long getQuantity() {
        return quantity;
    }

    /**
     * @param id the id to set
     */
    public void setQuantity(long id) {
        this.quantity = id;
    }

}