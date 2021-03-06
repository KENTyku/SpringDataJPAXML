/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package com.ardecs.SpringDataJpaXml.Entity;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 * @author Yuri Tveritin, e-mail: kentyku@bk.ru
 */
@Entity
//    @NamedQuery(name = "findAllProducts", query = "SELECT p FROM Product p")
public class Product {

    @Id
    @GeneratedValue
    @NotNull
    private long id;
    @NotNull
    private float price;
    @NotNull
    private String name;
    private String comment;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.REFRESH, CascadeType.PERSIST})
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.REFRESH, CascadeType.PERSIST})
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    public Product() {
    }

    public Product(@NotNull float price, @NotNull String name, String comment, Country country, Category category) {
        this.price = price;
        this.name = name;
        this.comment = comment;
        this.country = country;
        this.category = category;
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
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

//    /**
//     * @return the categoryID
//     */
//    public long getCategoryID() {
//        return categoryID;
//    }
//
//    /**
//     * @param categoryID the categoryID to set
//     */
//    public void setCategoryID(long categoryID) {
//        this.categoryID = categoryID;
//    }
//
//    /**
//     * @return the countryID
//     */
//    public long getCountryID() {
//        return countryID;
//    }
//
//    /**
//     * @param countryID the countryID to set
//     */
//    public void setCountryID(long countryID) {
//        this.countryID = countryID;
//    }

    /**
     * @return the name
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

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", comment='" + comment + '\'' +
                ", country=" + country +
                ", category=" + category +
                '}';
    }
}
