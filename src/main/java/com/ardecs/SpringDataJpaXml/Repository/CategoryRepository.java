/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package com.ardecs.SpringDataJpaXml.Repository;

import com.ardecs.SpringDataJpaXml.Entity.Category;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Yuri Tveritin, e-mail: kentyku@bk.ru
 */

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Category findByCategoryName(String name);
}
