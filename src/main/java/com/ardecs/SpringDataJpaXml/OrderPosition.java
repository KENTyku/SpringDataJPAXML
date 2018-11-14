package com.ardecs.SpringDataJpaXml;/*
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
@Table(name = "order_position")
public class OrderPosition {
    @Id
    @GeneratedValue
    @NotNull
    private long id;
    private long quantity;
//    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
//    @JoinColumn(name = "order_id", nullable = false)
//    private Order order;
//    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
//    @JoinColumn(name = "product_id", nullable = false)
//    private Product product;

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


//    public Order getOrder() {
//        return order;
//    }
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
}