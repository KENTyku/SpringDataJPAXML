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
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue
    @NotNull
    private long id;
    @NotNull
    @Column(name = "name")
    private String name;
    @NotNull
    @Column(name = "telefon_number")
    private String telefonNumber;
    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.REFRESH, CascadeType.PERSIST,CascadeType.REMOVE})
    @JoinColumn(name = "order_id", nullable = false)
    private List<Order> orderss;

    public Client() {
    }

    Client(String name) {
        this.name = name;
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
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return id + " " + name;
    }

    public String getTelefonNumber() {
        return telefonNumber;
    }

    public void setTelefonNumber(String telefonNumber) {
        this.telefonNumber = telefonNumber;
    }

    public List<Order> getOrderss() {
        return orderss;
    }

    public void setOrderss(List<Order> orderss) {
        this.orderss = orderss;
    }
}
