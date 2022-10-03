package com.AntonioZamora.Zamora.Service.Impl;

import com.AntonioZamora.Zamora.Entity.Producto;
import com.AntonioZamora.Zamora.Service.ProductoService;
import com.AntonioZamora.Zamora.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author etham
 */

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    ProductoRepository productoRepository;
    
    @Override
    public List<Producto> findAll() {
        return (List<Producto>) productoRepository.findAll();
    }

    @Override
    public Producto findById(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void delete(Producto producto) {
        productoRepository.delete(producto);
    }

    @Override
    public void deleteById(Long id) {
        productoRepository.deleteById(id);
    }
    
}
