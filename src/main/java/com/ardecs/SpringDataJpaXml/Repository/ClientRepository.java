/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package com.ardecs.SpringDataJpaXml.Repository;

import com.ardecs.SpringDataJpaXml.Entity.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Yuri Tveritin, e-mail: kentyku@bk.ru
 */

public interface ClientRepository extends CrudRepository<Client, Long> {
    ArrayList <Client> findAll();
    Optional<Client> findById(Long id);





}
