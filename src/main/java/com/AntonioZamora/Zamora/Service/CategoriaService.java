package com.AntonioZamora.Zamora.Service;

import com.AntonioZamora.Zamora.Entity.Categoria;
import java.util.List;

/**
 *
 * @author etham
 */

public interface CategoriaService {
    
    public List<Categoria> findAll();
    public Categoria findById(Long id);
    public Categoria save (Categoria categoria);
    public void delete(Categoria categoria);
    public void deleteById(Long id);
    
}
