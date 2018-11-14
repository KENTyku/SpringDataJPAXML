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

public interface ProductRepository extends CrudRepository<Product, Long> {
    Product findByName(String name);
//    Optional<Country> findById(Long id);




}
