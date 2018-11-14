/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package com.ardecs.SpringDataJpaXml;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Yuri Tveritin, e-mail: kentyku@bk.ru
 */
@Entity
//    @NamedQuery(name = "findAllProducts", query = "SELECT p FROM Product p")
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue
    @NotNull
    private long id;
    @NotNull
    private float price;
    //    @NotNull
//    @Column(name = "category_id")
//    private long categoryID;
//    @NotNull
//    @Column(name = "country_id")
//    private long countryID;
    @NotNull
    private String name;
    private String comment;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "order_position", nullable = false)
    private List<OrderPosition> orderPositions;

    public Product() {
    }

    Product(String name) {
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

    public List<OrderPosition> getOrderPositions() {
        return orderPositions;
    }

    public void setOrderPositions(List<OrderPosition> orderPositions) {
        this.orderPositions = orderPositions;
    }
}
