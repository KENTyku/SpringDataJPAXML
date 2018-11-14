/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package com.ardecs.SpringDataJpaXml;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

/**
 *
 * @author Yuri Tveritin, e-mail: kentyku@bk.ru
 */

public interface ClientRepository extends CrudRepository<Client, Long> {
    ArrayList <Client> findAll();
    void deleteClientByName(String name);
    




}
