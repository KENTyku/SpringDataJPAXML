/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package com.ardecs.SpringDataJpaXml;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Yuri Tveritin, e-mail: kentyku@bk.ru
 */

public interface OrderRepository extends CrudRepository<Order, Long> {
    Order findByClient(String name);
//    Optional<Country> findById(Long id);




}
