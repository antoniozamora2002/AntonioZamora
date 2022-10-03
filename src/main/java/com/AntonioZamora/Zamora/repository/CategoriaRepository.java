package com.AntonioZamora.Zamora.repository;

import com.AntonioZamora.Zamora.Entity.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author etham
 */

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long>{
    
}
