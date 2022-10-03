package com.AntonioZamora.Zamora.repository;

import com.AntonioZamora.Zamora.Entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author etham
 */

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{
    
}
