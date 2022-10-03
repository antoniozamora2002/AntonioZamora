package com.AntonioZamora.Zamora.Service;

import com.AntonioZamora.Zamora.Entity.Categoria;
import com.AntonioZamora.Zamora.Entity.Producto;
import java.util.List;

/**
 *
 * @author etham
 */

public interface ProductoService {
    
    public List<Producto> findAll();
    public Producto findById(Long id);
    public Producto save (Producto producto);
    public void delete(Producto producto);
    public void deleteById(Long id);
    
}
