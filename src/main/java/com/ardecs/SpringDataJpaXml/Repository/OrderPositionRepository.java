/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package com.ardecs.SpringDataJpaXml.Repository;

import com.ardecs.SpringDataJpaXml.Entity.Country;
import com.ardecs.SpringDataJpaXml.Entity.OrderPosition;
import com.ardecs.SpringDataJpaXml.Entity.OrderPositionId;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Yuri Tveritin, e-mail: kentyku@bk.ru
 */

public interface OrderPositionRepository extends CrudRepository<OrderPosition, OrderPositionId> {
//    Country findByCountryName(String name);
//    Optional<Country> findById(Long id);




}
