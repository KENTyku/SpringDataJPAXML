package com.ardecs.SpringDataJpaXml;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.persistence.*;
import javax.validation.constraints.NotNull;


/**
 *
 * @author jury
 */
//@Component
@Entity
@Table(name = "country")
    @NamedQuery(name = "findAllProducts", query = "SELECT p FROM Country p")
public class Country  {

    @Id
    @GeneratedValue
    private long id;
    @NotNull
    @Column(name = "country_name")
    private String countryName;

    public Country() {
    }

    Country(String countryName) {
        this.countryName = countryName;
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
    public String getCountryName() {
        return countryName;
    }

    /**
     * @param country_name the country_name to set
     */
    public void setCountryName(String country_name) {
        this.countryName = country_name;
    }
    @Override
    public String toString(){

        return id+" "+countryName;
    }
}
