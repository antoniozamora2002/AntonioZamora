package com.AntonioZamora.Zamora.Controller;

import com.AntonioZamora.Zamora.Entity.Producto;
import com.AntonioZamora.Zamora.Service.ProductoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author etham
 */

@RestController
@RequestMapping("/producto")
@Api(value = "Microservicio de Gestion de los productos", description = "Microservicio de Gestion de los productos")
public class ProductoController {
    
    @Autowired
    ProductoService productoService;
    
    @ApiOperation(value = "Lista de productos")
    @GetMapping("/all")
    public List<Producto> findAll(){
        return productoService.findAll();
    }
    
    @ApiOperation(value = "Obtiene datos de un producto")
    @GetMapping("/{id}")
    public ResponseEntity<Producto> findById(@PathVariable Long id){
        Producto product = productoService.findById(id);
        return ResponseEntity.ok(product);
    }
    
    @ApiOperation(value = "Crea una producto")
    @PostMapping("/save")
    public Producto save(@RequestBody Producto product){
        return productoService.save(product);
    }
    
    @ApiOperation(value = "Modifica un producto")
    @PutMapping("/update")
    public Producto update(@RequestBody Producto product){
        return productoService.save(product);
    }
    
    @ApiOperation(value = "Elimina un producto")
    @DeleteMapping("/id")
    public void deleteById(@PathVariable Long id){
        productoService.deleteById(id);
    }
    
}
