package com.AntonioZamora.Zamora.Service.Impl;

import com.AntonioZamora.Zamora.Entity.Categoria;
import com.AntonioZamora.Zamora.Service.CategoriaService;
import com.AntonioZamora.Zamora.repository.CategoriaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author etham
 */

@Service
public class CategoriaServiceImpl implements CategoriaService{
    
    @Autowired
    CategoriaRepository Categoriarepository;

    @Override
    public List<Categoria> findAll() {
        return (List<Categoria>) Categoriarepository.findAll();
    }

    @Override
    public Categoria findById(Long id) {
        return Categoriarepository.findById(id).orElse(null);
    }

    @Override
    public Categoria save(Categoria categoria) {
        return Categoriarepository.save(categoria);
    }

    @Override
    public void delete(Categoria categoria) {
        Categoriarepository.delete(categoria);
    }

    @Override
    public void deleteById(Long id) {
        Categoriarepository.deleteById(id);
    }
    
}
