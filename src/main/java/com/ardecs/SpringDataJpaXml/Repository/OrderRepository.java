/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package com.ardecs.SpringDataJpaXml.Repository;

import com.ardecs.SpringDataJpaXml.Entity.Order;
import com.ardecs.SpringDataJpaXml.Entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 *
 * @author Yuri Tveritin, e-mail: kentyku@bk.ru
 */

public interface OrderRepository extends CrudRepository<Order, Long> {
    @Query("SELECT o from Order o where o.client.id=?1 ")
    List<Order> findAllOrder(long id);
//    Order findByClient(String name);
//    Optional<Country> findById(Long id);
//    List<Product> findAll




}
